
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_10_Posicion_Paises {

     public static void main(String[] args) {
        String paises = "";
        int pos;
        String vector[] = new String[5];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 5 paises");
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Posicon[" + i + "] Ingrese Pais: ");
            vector[i] = teclado.nextLine();
        }
        System.out.println("");
        System.out.print("Ingrese posicion para saber cual pais es: ");
        pos = teclado.nextInt();
        if (pos == 0 || pos < 5) {
            System.out.println("Posicion " + pos + " Encontrado Pais: " + vector[pos]);

        } else {
            System.err.println("Posicion " + pos + " NO Encontrada: ");
        }
    }

}