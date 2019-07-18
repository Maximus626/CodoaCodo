package Actividad_Practica_Unidad_5;

import java.util.Scanner;

public class Ejercicio_02_Funcion_SumaResta {

    public static void main(String[] args) {

        int num1, num2;
        String hacer;
        int resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num1 = teclado.nextInt();
        System.out.println("Ingrese un numero");
        num2 = teclado.nextInt();
        System.out.println("(S)umar / (R)estar");
        hacer = teclado.next();
        System.out.println("");
        hacer = hacer.toUpperCase();
        switch (hacer) {
            case "S":
                resultado = sumaNumeros(num1, num2);
                System.out.println("La suma de los numeros " + num1 + " y " + num2 + " es: " + resultado);
                break;
            case "R":
                resultado = restaNumeros(num1, num2);
                System.out.println("La resta de los numeros " + num1 + " y " + num2 + " es: " + resultado);
                break;
            default:
                System.err.println("No es una opcion valida vuela a ingresar");
        }

    }

    public static int sumaNumeros(int num1, int num2) {

        int Sresultado = num1 + num2;

        return Sresultado;
    }

    public static int restaNumeros(int num1, int num2) {

        int Rresultado = num1 - num2;

        return Rresultado;
    }
}
