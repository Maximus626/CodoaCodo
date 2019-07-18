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
public class MetodoMayorMenor {

    /**
     * @param args the command line arguments
     */
    public static int mayor(int num1, int num2){
        if (num1>num2){
            return num1;
        }else{
            return num2;
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int cant1 = sc.nextInt();
        System.out.println("Ingrese un numero");
        int cant2 = sc.nextInt();
        System.out.println("El mayor es: "+mayor(cant1,cant2));
        
    }
    
}
