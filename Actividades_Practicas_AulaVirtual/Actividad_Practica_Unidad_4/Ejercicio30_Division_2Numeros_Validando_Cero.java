
package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio30_Division_2Numeros_Validando_Cero {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num2 = 0;

        System.out.println("Ingrese el primer numero");
        int num1 = sc.nextInt();

        do {
            System.out.println("Ingrese el segundo numero");
            num2 = sc.nextInt();
            if (num2 == 0) {
                System.out.println("Ingrese un numero válido");
            }
        } while (num2 == 0);
        
        double resultado = (double) num1 / (double) num2;
        
        System.out.println("El resultado es: " + resultado);

    }
}