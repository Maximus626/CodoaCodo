
package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio29_SumaDosNumeros_Validando_Cero {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int resultado;

        do {
            
            System.out.println("Ingrese 0 en los dos numeros para salir");
            System.out.println("Ingrese el primer numero");
            num1 = sc.nextInt();

            System.out.println("Ingrese el segundo numero");
            num2 = sc.nextInt();

            if (num1 > 0 && num2 > 0) {

                resultado = num1 + num2;

                System.out.println("La suma es: " + resultado);
            }

            System.out.println("");

        } while (!(num1 == 0) && !(num2 == 0));
        
        System.out.println("Programa Finalizado");

    }
}