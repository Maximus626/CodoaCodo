package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_02_Numeros_Mitad {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = new int[4];
        int i;
        for (i = 0; i < vector.length; i++) {
            System.out.println("4 Numeros, Ingrese numero " + "[" + (i + 1) + "]");
            vector[i] = teclado.nextInt();
        }
        System.out.println("");
        for (i = 0; i < vector.length; i++) {
            float n = (float) vector[i] / 2;
            System.out.println("La Mitad de " + vector[i] + " es " + n);

        }

    }

}
