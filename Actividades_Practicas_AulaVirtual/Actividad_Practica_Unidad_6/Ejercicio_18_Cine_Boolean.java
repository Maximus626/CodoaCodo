
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_18_Cine_Boolean {
public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean validado = false;
        double porcent = 0;

        System.out.println("Ingrese la cantidad de butacas en el cine: ");
        int butacas = sn.nextInt();

        int[] buffer = new int[butacas / 2];
        int j = 0;

        for (int i = butacas; i > 0; i--) {
            if (butacas % i == 0) {
                buffer[j] = i;
                j++;
            }
        }
        int cant = 0;
        while (!validado) {
            System.out.println("Confirme la cantidad de butacas por fila: ");

            for (int i = 0; i < buffer.length; i++) {
                if (buffer[i] != 0) {
                    System.out.println("- " + buffer[i]);
                }
            }
            System.out.print("Cantidad de butacas por fila: ");
            cant = sn.nextInt();
            for (int i : buffer) {
                if (i == cant) {
                    validado = true;
                    int filas = (butacas / cant);
                    System.out.println("Cantidad de butacas por fila validada.");
                    System.out.println("Su cine tiene " + filas + " filas de " + cant + " butacas cada una.");
                    break;
                }
            }
        }
        int filas = (butacas / cant);
        int acum = 0;
        boolean[][] cine = new boolean[filas][cant];
        System.out.println("A continuación presione 1 para confirmar si el asiento en cuestión se encuentra ocupado \no bien presione cualquier otro número por lo contrario");
        for (int i = 0; i < cine.length; i++) {
            for (int k = 0; k < cine[i].length; k++) {
                System.out.print("Asiento n°" + i + (k + 1) + " ¿Se encuentra ocupado?");
                int ocupado = sn.nextInt();
                if (ocupado == 1) {
                    cine[i][k] = true;
                    acum += 1;
                }
            }
        }
        porcent = ((double) acum / (double) butacas) * 100;
        System.out.print("El cine tiene ocupados " + acum + " asientos de " + butacas + " totales");
        System.out.printf("siendo esto un %.2f", porcent);
        System.out.print("% de la capacidad total.");
    }
}