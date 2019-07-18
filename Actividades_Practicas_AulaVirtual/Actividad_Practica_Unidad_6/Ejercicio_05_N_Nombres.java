package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_05_N_Nombres {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int largo = 0;
        System.out.print("Cantidad de nombres que ingresa.:");

        largo = teclado.nextInt();
        teclado.nextLine();
        System.out.println("");
        String palabra[] = new String[largo];
        for (int i = 0; i < palabra.length; i++) {
            System.out.print("Ingrese Nombre: ");
            palabra[i] = teclado.nextLine();
        }
        System.out.println("");
        System.out.print("Ud Ingreso: ");

        for (int i = 0; i < palabra.length; i++) {
            System.out.print(palabra[i] + " ");
        }
    }
}
