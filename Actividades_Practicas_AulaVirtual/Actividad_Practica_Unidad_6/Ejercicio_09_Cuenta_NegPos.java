
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_09_Cuenta_NegPos {

     public static void main(String[] args) {
        int largo;
        int positivo = 0;
        int negativo = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese largo del vector : ");
        largo = teclado.nextInt();
        int vector[] = new int[largo];
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese numero[" + (i + 1) + "]: ");
            vector[i] = teclado.nextInt();
            if (vector[i] >= 0) {
                positivo = positivo + 1;
            } else {
                negativo = negativo + 1;
            }
        }
        System.out.println("");
        System.out.println("Numeros Positivos: " + positivo);
        System.out.println("Numeros Negativos: " + negativo);
    }
}