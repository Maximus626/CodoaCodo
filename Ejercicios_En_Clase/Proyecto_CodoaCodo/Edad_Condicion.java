/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_CodoaCodo;

import java.util.Scanner;
    public class Edad_Condicion {
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int edad; 
        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();
            if (edad >= 18){
            System.out.println("PUEDE INGRESAR");
            }else{
            System.out.println("NO PUEDE INGRESAR");
            
            }
    }
    
}
