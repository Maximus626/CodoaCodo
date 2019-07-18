package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio07_Par_Impar {

    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese numero");
        num1 = teclado.nextInt();
        int resto = num1 % 2;
        if (resto == 0) {
            System.out.println("el numero es Par");
        } else {
            System.out.println("El numero Impar");
        }

    }
}