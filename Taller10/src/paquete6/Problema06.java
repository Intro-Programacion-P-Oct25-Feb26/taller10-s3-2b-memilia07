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
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("Valor [%d][%d]: ", i, j);
                matrizOriginal[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matrizResultante[i][j] = matrizOriginal[i][j] * numero;
            }
        }

        reporte = String.format("%s\nMatriz Original:\n", reporte);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                reporte = String.format("%s%.2f ", reporte, 
                        matrizOriginal[i][j]);
            }
            reporte = String.format("%s\n", reporte);
        }

        reporte = String.format("%s\nMatriz Resultante (multiplicada "
                + "por %.2f):\n",
                reporte, numero);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                reporte = String.format("%s%.2f ", reporte, 
                        matrizResultante[i][j]);
            }
            reporte = String.format("%s\n", reporte);
        }
        

        System.out.println(reporte);
    }
}

        
    
    
    
    

