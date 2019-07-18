/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_CodoaCodo;
import java.util.Scanner;

public class Perimetro_Triangulo {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
         int per1, per2, per3, perime, resultado;
    
        per1 = teclado.nextInt();
        per2 = teclado.nextInt();
        per3 = teclado.nextInt();
        perime =  per1 + per2 + per3;
        System.out.println("el perimetro es" + perime);
    }
   
}
