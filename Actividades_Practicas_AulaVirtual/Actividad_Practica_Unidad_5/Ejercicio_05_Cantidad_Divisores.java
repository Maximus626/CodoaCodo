
package Actividad_Practica_Unidad_5;

import java.util.Scanner;

public class Ejercicio_05_Cantidad_Divisores {
 public static int cantidadDeDivisores(int num) {
        int contador = 0;
        for (int i = 1; i < 100; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = sc.nextInt();

        System.out.println("La cantidad de divisores es: " + cantidadDeDivisores(num));

    }
}