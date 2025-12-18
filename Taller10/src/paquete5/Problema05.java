/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {

        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};

        String acumulador = "";

        for(int fila = 0; fila < estudiantes.length; fila++) {
            for(int col = 0; col < estudiantes[fila].length; col++) {

                String nombre = estudiantes[fila][col];

                char letra = Character.toLowerCase(nombre.charAt(0));

                switch (letra) {
                    case 's':
                    case 'p':
                    case 't':

                        acumulador = acumulador + nombre + "\n";

                        break;
                }
            }

        }
        System.out.printf("Estudiantes con inicial S, P o T: \n%s\n", acumulador);
    }
}
