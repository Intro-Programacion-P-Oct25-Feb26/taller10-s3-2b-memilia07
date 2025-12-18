/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {

        boolean[][] sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, false},
            {false, false, false, false, false, false},
            {true, true, false, true, true, false}};

        int[] zonas = new int[sensores.length];

        for (int fila = 0; fila < sensores.length; fila++) {
            int contador = 0;
            for (int col = 0; col < sensores[fila].length; col++) {
                if (sensores[fila][col]) {
                    contador = contador + 1;
                }
            }

            zonas[fila] = contador;
        }
        for (int fila = 0; fila < sensores.length; fila++) {
            int fallos = sensores[fila].length - zonas[fila];
            System.out.printf("Zona %d\nZonas que funcionan sin fallos: %d\n"
                    + "Zonas que presentan fallos: %d\n",
                     (fila + 1), zonas[fila], fallos);
        }
    }
}
