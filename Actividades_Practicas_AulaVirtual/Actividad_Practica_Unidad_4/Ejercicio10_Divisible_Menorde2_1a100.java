package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio10_Divisible_Menorde2_1a100 {

    public static void main(String[] args) {
        int num2, resultado, resto;
        int num1= 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese primer numero del 1 al 100");
            num1 = teclado.nextInt();
        } while (num1 >100 || num1==0);
        do {
            System.out.println("Ingrese segundo numero del 1 al 100");
            num2 = teclado.nextInt();
        } while (num2 > 100 || num2 == 0);
        if (num1 > num2) {
           resultado = (num1 / num2);
           resto = num1 % num2;
            System.out.println(num1 + " es divisible por " + num2 + " y su resultado es: " + resultado+","+ resto);
        } else if (num1 < num2) {
            resultado = num2 / num1;
            resto = num2 % num1;
            System.out.println(num2 + " es divisible por " + num1 + " y su resultado es: " + resultado+"," + resto);
        } else {
          resultado = (num1 / num2);
            System.out.println("los numeros son iguales y su resultado es: " + (int)resultado);
        }

    }

}
