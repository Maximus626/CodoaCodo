package Ejercicios_Clases_30052019;

import java.util.Scanner;

public class Unidad5_metodoMultiplicacion {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void multiplicacion(int num1, int num2){
        int resultado = num1 * num2;
        System.out.println("El resultado es: " + resultado);
    }
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Ingrese un numero");
        num1 = sc.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = sc.nextInt();
        
        multiplicacion(num1, num2);
    }
}
