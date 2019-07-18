/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Clases_11062019;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Triangulo_Void {
 public static void main(String[] args) {
        area_triang();
        
    }
    
    
    
    public static void area_triang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base del triangulo ");
        double base = sc.nextDouble();
        System.out.println("Ingrese el valor de la altura de triangulo ");
        double altura = sc.nextDouble();
        System.out.println("El área del triángulo es "+ (base*altura/2));   
    
    }

    
}