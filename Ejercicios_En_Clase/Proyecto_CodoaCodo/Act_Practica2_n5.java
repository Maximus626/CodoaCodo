/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_CodoaCodo;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Act_Practica2_n5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        int numero1, numero2, resultado;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        numero1 = teclado.nextInt();
        
        System.out.println("Ingrese un numero");
        numero2 = teclado.nextInt();
        
        resultado = numero1 + numero2;
        
        System.out.println("La suma de los dos numeros es: "+ resultado);
    }
    
}
