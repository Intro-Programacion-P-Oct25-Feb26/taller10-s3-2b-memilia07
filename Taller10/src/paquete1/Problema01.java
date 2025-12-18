/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}};

        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};
        int[] diasAsistidos = new int[estudiantes.length];

        for (int fila = 0; fila < asistencia.length; fila++) {
            int contador = 0;
            for (int col = 0; col < asistencia[fila].length; col++) {
                if (asistencia[fila][col]) {
                    contador = contador + 1;

                }

            }

            diasAsistidos[fila] = contador;

        }

        for (int fila = 0; fila < estudiantes.length; fila++) {
            System.out.printf("Estudiantes: %s\nDias asistidos: %d ",
                    estudiantes[fila], diasAsistidos[fila]);

            if (diasAsistidos[fila] == 5) {
                System.out.println("(Cumple su asistencia)");

            } else {
                System.out.println("(No cumple su asistencia)");

            }

        }

    }
}
