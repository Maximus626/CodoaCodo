
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_20_StringMayusculas {

  public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Ingrese un texto: ");
        String cadena= st.nextLine();
        
        String CADENA = cadena.toUpperCase();
        
        System.out.println("Usted ha ingresado el texto: ");
        System.out.println(CADENA);
    }
    
}