package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio03_Cociente_2Numeros {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese un numero entero");
        num1 = teclado.nextInt();
        System.out.println("Ingrese un numero entero");
        num2 = teclado.nextInt();
        double num3 = (double)Math.cos(num1);
        double num4 = (double)Math.cos(num2);
        System.out.println(" ");
        System.out.println("El cociente de " + num1 + " es " + num3);
        System.out.println("El cociente de " + num2 + " es " + num4);              
    }
    
}
