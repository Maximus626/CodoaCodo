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
public class Nombre_password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String username, password username1, password1;

        String username = "tinostrozam";
        String password = "abc123";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresar nombre de usuario");
        String username1 = teclado.next();

        System.out.println("Ingrese password");
        String password1 = teclado.next();

        if (username.equals(username1) && password.equals(password1)) {
            System.out.println("Esta Autorizado puede ingresar");
        } else {
            System.out.println("No esta Autorizado NO tinosrpuede ingresar");
        }


    }
}