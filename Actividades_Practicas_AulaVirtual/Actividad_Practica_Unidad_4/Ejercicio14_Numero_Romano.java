
package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio14_Numero_Romano {

    public static void main(String[] args) {
        // TODO code application logic here
        String letra1 = "";
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;
        Scanner teclado = new Scanner(System.in);
        String letra;

        do {

            System.out.println("Ingrese un N° ROMANO (I/V/X/L/C/D/M)");
            letra1 = teclado.nextLine();
            letra = letra1.toUpperCase();
            switch (letra) {
                case "I":
                    System.out.println("El valor de " + letra + " es :" + I);
                    break;
                case "V":
                    System.out.println("El valor de " + letra + " es :" + V);
                    break;
                case "X":
                    System.out.println("El valor de " + letra + " es :" + X);
                    break;
                case "L":
                    System.out.println("El valor de " + letra + " es :" + L);
                    break;
                case "C":
                    System.out.println("El valor de " + letra + " es :" + C);
                    break;
                case "D":
                    System.out.println("El valor de " + letra + " es :" + D);
                    break;
                case "M":
                    System.out.println("El valor de " + letra + " es :" + M);
                    break;
                default:
                    System.out.println("ERROR! NO UN NUMERO ROMANO (I/V/X/L/C/D/M)");
            }
        } while (!"I".equals(letra) && !"V".equals(letra) && !"X".equals(letra) && !"L".equals(letra) && !"C".equals(letra) && !"D".equals(letra) && !"M".equals(letra));

    }

}
