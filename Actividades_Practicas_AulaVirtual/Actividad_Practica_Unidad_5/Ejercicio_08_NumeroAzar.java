package Actividad_Practica_Unidad_5;

import java.util.Scanner;

public class Ejercicio_08_NumeroAzar {

    public static void main(String[] args) {
        int num1;
        int max = 9;
        int min = 1;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num1 = teclado.nextInt();
        max = num1 - 1;
        for (int i = 1; i <= num1; i++) {
            int range = max - min + 1;
            double cualquiera = (azar(num1) * range) + min - 1;
            System.out.println("El numero " + i + " al azar es: " + Math.round(cualquiera));
        }

    }

    public static double azar(double num1) {

        double random = Math.random();

        return random;
    }

}
