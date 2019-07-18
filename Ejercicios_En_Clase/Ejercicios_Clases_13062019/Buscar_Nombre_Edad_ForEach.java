
package Ejercicios_Clases_13062019;

import java.util.Scanner;

public class Buscar_Nombre_Edad_ForEach {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int largovector = 5;
        String nombre[] = new String[largovector];
        int edad[] = new int[largovector];

        for (int i = 0; i < largovector; i++) {
            System.out.print("Ingrese nombre [" + (i + 1) + "]: ");
            nombre[i] = sc.next();
            System.out.print("Ingrese edad [" + (i + 1) + "]: ");
            edad[i] = sc.nextInt();
        }
        for (String sunum : nombre) {   //FOREACH
            System.out.println("Nombre: " + sunum);
        }
    }
}