
package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio22_Escalera_Constante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero de filas");
        int filas = sc.nextInt();

        while (filas > 0) {
            System.out.print("* ");
            filas = filas - 1;
        }
    

    System.out.println ("");
}
}

