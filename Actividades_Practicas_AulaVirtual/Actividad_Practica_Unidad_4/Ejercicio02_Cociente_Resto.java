
package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio02_Cociente_Resto {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num1, num2, resultado, resto;
        System.out.println("Ingrese un numero entero");
        num1 = teclado.nextInt();
        System.out.println("Ingrese un numero entero");
        num2 = teclado.nextInt();
        resultado = num1 / num2;
        System.out.println("El resultado de la division es: " + resultado);
        resto = num1 % num2;
        System.out.println("el resto de la division es: " + resto);
    }

}
