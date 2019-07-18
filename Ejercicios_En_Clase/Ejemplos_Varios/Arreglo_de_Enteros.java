package Ejemplos_Varios;

import java.util.Scanner;

public class Arreglo_de_Enteros {

    public static void main(String[] args) {

        int[] numeros = crearArregloDeEnteros(5);

        System.out.println("El arreglo queda:");

        mostrarArreglo(numeros);

    }

    static void mostrarArreglo(int[] a) {

        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");

        }

        System.out.println(""); // Línea en blanco

    }

    static int[] crearArregloDeEnteros(int tam) {

        int[] a = new int[tam];

        for (int i = 0; i < a.length; i++) {

            a[i] = leerEntero("Valor " + (i + 1) + " de " + a.length + ": ");

        }

        return a;

    }

    static int leerEntero(String cartel) {

        Scanner entrada = new Scanner(System.in);

        System.out.print(cartel);

        double x = entrada.nextDouble();

        while ((int) x != x) {

            System.out.print("ERROR. " + cartel);

            x = entrada.nextDouble();

        }

        return (int) x;

    }

}
