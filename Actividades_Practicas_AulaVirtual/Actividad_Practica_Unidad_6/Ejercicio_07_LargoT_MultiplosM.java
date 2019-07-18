package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_07_LargoT_MultiplosM {

    public static void main(String[] args) {
        int T;
        int M;
        int lleno;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Largo o Posiciones");
        T = teclado.nextInt();
        System.out.println("Multiplos");
        M = teclado.nextInt();
        int vector[] = new int[T];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = M * i;
            System.out.println("Posicion:" + (i + 1) + " Multiplos [" + M + "]X[" + i + "]=" + vector[i]);
        }

    }

}
