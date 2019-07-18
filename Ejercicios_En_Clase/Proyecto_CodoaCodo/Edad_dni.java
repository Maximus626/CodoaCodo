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
public class Edad_dni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String username, password username1, password1;

        int edad;
        String dni = "12345678";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();

        System.out.println("Ingrese DNI");
        String dni1 = teclado.next();

        if (edad>=18 || dni.equals(dni1)) {
            System.out.println("Puedes ingresar al boliche");
        } else {
            System.out.println("No puede ingresar al boliche");
        }


    }
}