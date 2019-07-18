
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_22_Primera_Mayuscula {
 public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        
        System.out.println("Ingrese un texto: ");
        String texto = st.nextLine();
        texto = texto.toLowerCase();
        String TEXTO = texto.toUpperCase();
        
        String oracion = TEXTO.charAt(0)+texto.substring(1)+".";
        System.out.println("Usted ha ingresado el texto: "+ oracion);

    }
}
