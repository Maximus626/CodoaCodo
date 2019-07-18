
package Ejercicios_Clases_13062019;

import java.util.Scanner;

public class Nombre_Edad {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] edad = new int[3];
        String[] nombre = new String[3];

        for (int i = 0; i < edad.length; i++) {
            System.out.println("Ingrese el nombre");
            nombre[i] = sc.next();
            System.out.println("Ingrese la edad");
            edad[i] = sc.nextInt();
        }

        int cont = 2;
        for (String lista : nombre) {
            for (int edades : edad) {
                System.out.println("Edad: " + edades);
            }
            System.out.println("Nombre: " + lista);
        }

    }
}