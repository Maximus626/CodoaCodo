package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio17_TablaMulti_DeunNumero {

    public static void main(String[] args) {

        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero para conocer su tabla hasta el 10");
        numero = teclado.nextInt();

        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero+" X "+i+" = "+ resultado);
        }
    }
}


