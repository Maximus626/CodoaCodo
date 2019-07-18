package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio24_Peso {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = 0;
            int suma = 0;
            int contador = 0;

            do {

                System.out.println("Ingrese el peso (Ingrese 0 para salir)");
                num = sc.nextInt();

                if (num != 0) {
                    suma += num;
                    contador++;
                }

            } while (num != 0);

            double promedio = (double) suma / (double) contador;

            System.out.printf("EL promedio es: %.2f", promedio);
            System.out.println("");

        }
    }

