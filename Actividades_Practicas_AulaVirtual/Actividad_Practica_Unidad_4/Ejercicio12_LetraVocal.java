package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio12_LetraVocal {

    public static void main(String[] args) {
        // TODO code application logic here
        String letra1 = "";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un letra");
        letra1 = teclado.nextLine();
        String letra = letra1.toUpperCase();
        System.out.println(letra);
        switch (letra) {
            case "A":
                System.out.println("La letra " + letra + " es una vocal");
                break;
            case "E":
                System.out.println("La letra " + letra + " es una vocal");
                break;
            case "I":
                System.out.println("La letra " + letra + " es una vocal");
                break;
            case "O":
                System.out.println("La letra " + letra + " es una vocal");
                break;
            case "U":
                System.out.println("La letra " + letra + " es una vocal");
                break;
            default:
                System.out.println("La letra " + letra + " no es una vocal");

        }

    }

}
