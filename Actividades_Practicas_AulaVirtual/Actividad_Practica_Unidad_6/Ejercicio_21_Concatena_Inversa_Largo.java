
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_21_Concatena_Inversa_Largo {
public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Ingrese la primer cadena de texto: ");
        String cadena1= st.nextLine();
        
        System.out.println("Ingrese la segunda cadena de texto: ");
        String cadena2= st.nextLine();
        
        System.out.println("Ingrese la tercer cadena de texto: ");
        String cadena3= st.nextLine();
        
        String cadena4=cadena3+" "+cadena2+" "+cadena1;
        
        System.out.print("El texto resultante es: ");
        System.out.println("\""+cadena4+"\"");
        System.out.println("Y tiene una longitud de "+cadena4.length()+" caracteres");
    }
}
