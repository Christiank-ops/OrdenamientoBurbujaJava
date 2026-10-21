/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodoburbuja;

import java.util.Arrays;

/**
 *
 * @author chris
 */
public class MetodoBurbuja {

    
    public static void ordenamientoBurbuja(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {

            // Ciclo interno: compara elementos adyacentes
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {6, 2, 4, 1};

        System.out.println("Antes:   " + Arrays.toString(numeros));
        ordenamientoBurbuja(numeros);
        System.out.println("Después: " + Arrays.toString(numeros));
    }
    
}
