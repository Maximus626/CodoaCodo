package Actividad_Practica_Unidad_5;

import java.util.Scanner;

public class Ejercicio_07_Imprimir_Simbolo {

    public static void imprimirSimbolo(int num, char simbolo) {

        for (int i = 0; i < num; i++) {
            System.out.print(simbolo);
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        System.out.println("Ingrese un simbolo");
        char simbolo = sc.next().charAt(0);

        imprimirSimbolo(num, simbolo);

    }
}
