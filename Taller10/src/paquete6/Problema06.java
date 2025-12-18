/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double numero;
        double[][] matrizOriginal = new double[5][6];
        double[][] matrizResultante = new double[5][6];

        String reporte = "";

        System.out.println("Ingrese un número entero o real: ");
        numero = entrada.nextDouble();

        System.out.println("\nIngrese los valores de la matriz (5x6):");
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 6; col++) {
                System.out.printf("Valor [%d][%d]: ", fila, col);
                matrizOriginal[fila][col] = entrada.nextDouble();
            }
        }

        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 6; col++) {
                matrizResultante[fila][col] = matrizOriginal[fila][col] * numero;
            }
        }

        reporte = String.format("%s\nMatriz Original:\n", reporte);
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 6; col++) {
                reporte = String.format("%s%.2f ", reporte, 
                        matrizOriginal[fila][col]);
            }
            reporte = String.format("%s\n", reporte);
        }

        reporte = String.format("%s\nMatriz Resultante (multiplicada "
                + "por %.2f):\n",
                reporte, numero);

        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 6; col++) {
                reporte = String.format("%s%.2f ", reporte, 
                        matrizResultante[fila][col]);
            }
            reporte = String.format("%s\n", reporte);
        }
        

        System.out.println(reporte);
    }
}

        
    
    
    
    

