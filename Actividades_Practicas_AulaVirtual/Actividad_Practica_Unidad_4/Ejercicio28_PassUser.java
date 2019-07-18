
package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio28_PassUser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Scanner sd = new Scanner(System.in);

        
        String userCorr = "admin";
        String passCorr = "1234";
        
        String pass;
        String user;
        
        do {

            System.out.println("Ingrese el usuario");
            user = sc.next();

            System.out.println("Ingrese la contraseña");
            pass = sd.next();

        } while (!user.equals(userCorr) && !pass.equals(passCorr));
        
        System.out.println("Contraseña Correcta");

    }
}