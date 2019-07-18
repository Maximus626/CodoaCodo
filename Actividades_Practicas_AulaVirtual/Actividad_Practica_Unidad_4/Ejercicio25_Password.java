
package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio25_Password {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        String pass;
        String pass_right = "eureka";

        System.out.println("Ingrese la contraseña");
        pass = sc.next();

        if (!pass.equals(pass_right)) {
            while (contador < 3) {
                System.out.println("Contraseña incorrecta");
                System.out.println("Ingrese la contraseña");
                pass = sc.next();
                if (pass.equals(pass_right)) {
                    System.out.println("Contraseña Correcta");
                    break;
                }
                contador++;
            }
        }
        
        if (contador == 3) {
            System.out.println("Se acabaron los intentos");
        }

    }
}