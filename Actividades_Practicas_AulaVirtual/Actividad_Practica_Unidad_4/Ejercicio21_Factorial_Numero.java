/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_Practica_Unidad_4;

import java.util.Scanner;

/**
 *
 * @author Maximus626
 */
public class Ejercicio21_Factorial_Numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int factorial = 1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.println("El factorial de " + num + " es: " + factorial);
        
    }
}
