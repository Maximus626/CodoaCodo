
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_23_Suma_CadenaNumerica {
 public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int acum=0;
        
        System.out.println("Ingrese un número de 3 digitos: ");
        String numero = sn.nextLine();
        
        for (int i = 0; i < numero.length(); i++) {
            acum+=Character.getNumericValue(numero.charAt(i));
        }
        System.out.println("La suma de las "+numero.length()+" cifras ingresadas es "+acum);
    }
}