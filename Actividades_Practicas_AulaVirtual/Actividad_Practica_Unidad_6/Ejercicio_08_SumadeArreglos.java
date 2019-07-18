package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_08_SumadeArreglos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vector1[] = new int[5];
        int vector2[] = new int[5];
        int vector3[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese numero [" + (i + 1) + "] de 5 Vector1: ");
            vector1[i] = teclado.nextInt();
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese numero [" + (i + 1) + "] de 5 Vector2: ");
            vector2[i] = teclado.nextInt();
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            vector3[i] = vector1[i] + vector2[i];
            System.out.println("la suma Vector1+Vector2 posicion " + (i + 1) + " es : " + vector3[i]);
        }
    }
}
