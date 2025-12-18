/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[][] A = new int[3][2];
        int[][] B = new int[3][2];

        String reporte = "";

        System.out.println("Ingrese los valores de la matriz A (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("A[%d][%d]: ", i, j);
                A[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nIngrese los valores de la matriz B (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("B[%d][%d]: ", i, j);
                B[i][j] = entrada.nextInt();
            }
        }

        reporte = String.format("%s\nMatriz A:\n", reporte);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                reporte = String.format("%s%d ", reporte, A[i][j]);
            }
            reporte = String.format("%s\n", reporte);
        }

        reporte = String.format("%s\nMatriz B:\n", reporte);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                reporte = String.format("%s%d ", reporte, B[i][j]);
            }
            reporte = String.format("%s\n", reporte);
        }

        int contadorMenores = 0;
        int contadorMayores = 0;
        int contadorIguales = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {

                if (A[i][j] < B[i][j]) {
                    contadorMenores++;
                }
                if (A[i][j] > B[i][j]) {
                    contadorMayores++;
                }
                if (A[i][j] == B[i][j]) {
                    contadorIguales++;
                }
            }
        }

        if (contadorIguales == 6) {
            reporte = String.format("%s\nLa matriz A es igual a la matriz B", reporte);

        } else if (contadorMenores == 0 && contadorMayores > 0) {
            reporte = String.format("%s\nLa matriz A es mayor que la matriz B", reporte);

        } else {
            reporte = String.format("%s\nLa matriz A no es mayor que la matriz B", reporte);
        }

        System.out.println(reporte);
    }
}
        
    


