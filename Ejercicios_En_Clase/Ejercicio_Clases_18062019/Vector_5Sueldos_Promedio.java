package Ejercicio_Clases_18062019;

import java.util.Scanner;

public class Vector_5Sueldos_Promedio {

    //static Scanner teclado = new Scanner(System.in);
    static int vector[] = new int[5];

    public static void ingresar() {

        for (int i = 0; i < vector.length; i++) {
           // vector[i] = teclado.nextInt();

        }
    }

    public static void main(String[] args) {
        sueldos();
        ordenar();
        promedio();

    }

    public static void sueldos() {
        Scanner teclado = new Scanner(System.in);
//        int vector[] = new int[5];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese sueldo " + (i + 1));
            vector[i] = teclado.nextInt();
        }

    }

    public static void ordenar() {
        int i, j, aux;
        for (i = 0; i < vector.length - 1; i++) {
            for (j = 0; j < vector.length - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;

                }
            }

        }
        System.out.println("");
        System.out.println("Sueldos ordenados");

        for (i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

    }

    public static void promedio() {
        int i;
        int promedio = 0;
        for (i = 0; i < vector.length; i++) {
            promedio = promedio + vector[i];
        }
        int total = promedio / vector.length;
        System.out.println("");
        System.out.println("Promedio de los sueldos: " + total);
    }

}
