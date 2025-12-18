/*
 Dado el siguiente código

public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        double[][] dato1 = {{1, 2, 3},{6, 8, 9}};
        double[][] dato2 = {{10, 1, 2},{10, 9, 1}};
        // En función de los arreglos dados, genere
        // un arreglo que tenga los siguientes valores
        /*
            1   1   2
            6   8   1
 */
package paquete8;

/**
 *
 * @author USER_ASUS
 */
public class Problema08 {

    public static void main(String[] args) {

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};
        String reporte = "";

        for (int fila = 0; fila < dato1.length; fila++) {
            for (int col = 0; col < dato1[fila].length; col++) {
                if (col <= fila) {
                    reporte = String.format("%s%.0f\t", reporte, dato1[fila][col]);
                } else {
                    reporte = String.format("%s%.0f\t", reporte, dato2[fila][col]);
                }
            }
            reporte = String.format("%s\n", reporte);
        }
        System.out.println(reporte);
    }
}
