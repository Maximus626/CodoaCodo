package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_03_LetrasAlReves {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int largo = 0;
        System.out.print("Cantidad de letras que ingresara.:");
        System.out.println("");
        largo = teclado.nextInt();
        teclado.nextLine();
        String palabra[] = new String[largo];
        for (int i = 0; i < palabra.length; i++) {
            System.out.print("Ingrese Letra: ");
            palabra[i] = teclado.nextLine();
        }
        System.out.println("");
        System.out.print("Ud Ingreso: ");

        for (int i = 0; i < palabra.length; i++) {
            System.out.print(palabra[i]);

        }
        System.out.println("");
        System.out.print("Al Reves: ");

        for (int i = palabra.length - 1; i >= 0; i--) {
            System.out.print(palabra[i]);
        }
        System.out.println("");
    }

}
