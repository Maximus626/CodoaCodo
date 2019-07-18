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
public class Numero_Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n1, n2; 
        System.out.println("Ingrese numero");
        n1 = teclado.nextInt();
        System.out.println("Ingrese numero");
        n2 = teclado.nextInt();
            if (n1 > n2){
            System.out.println("El numero 1 es mayor " + n1);
            }else{
            System.out.println("El numero 2 es Mayor " + n2);
    }
    
}
    }
