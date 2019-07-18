
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_26_Nombre_Reves {

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre, por favor");
        String nombre = st.nextLine();
        String vesre="";
        
        for (int i = nombre.length(); i > 0 ; i--) {
            vesre+=nombre.charAt(i-1);
        }
        System.out.println("¿Su nombre es "+vesre+"?");
    }
}