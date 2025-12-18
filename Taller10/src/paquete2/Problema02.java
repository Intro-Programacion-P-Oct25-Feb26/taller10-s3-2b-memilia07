/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {

        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}};

        int menores = 0;
        int[] adultosF = new int[edades.length];

        for (int fila = 0; fila < edades.length; fila++) {
            int adultos = 0;
            for (int col = 0; col < edades[fila].length; col++) {
                if (edades[fila][col] < 18) {
                    menores = menores + 1;
                } else {
                    adultos = adultos + 1;
                }
            }

            adultosF[fila] = adultos;
        }

        System.out.printf("Total de menores de edad: %d\n", menores);

        for (int fila = 0; fila < adultosF.length; fila++) {
            System.out.printf("Familia %d: %d adultos\n", (fila + 1), adultosF[fila]);
        }
    }
}
