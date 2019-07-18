package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_01_5numeros_Array {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = new int[5];
        int i;
        for (i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un numero");
            vector[i] = teclado.nextInt();

        }
        System.out.println("");
        System.out.println("Numeros Ingresados");
        System.out.println("==================");

        for (i = 0; i < vector.length; i++) {
            System.out.println("Numero ingresado " + vector[i]);

        }

    }

}
