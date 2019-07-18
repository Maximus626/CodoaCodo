
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_27_Vocales_Consonantes {
 public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        System.out.println("Ingrese su nombre, por favor");
        String nombre = st.nextLine();
        int vocales=0, consonantes=0;

        for (int i = 0; i < nombre.length(); i++) {
            char letra = nombre.charAt(i);
            if (Character.toLowerCase(letra) == 'a' || Character.toLowerCase(letra) == 'e' || Character.toLowerCase(letra) == 'i' || Character.toLowerCase(letra) == 'o' || Character.toLowerCase(letra) == 'u') {
                vocales+=1;
            }else{
                consonantes+=1;
            }
        }
        System.out.println("El nombre ingresado, \""+nombre+"\" tiene "+vocales+" vocales y "+consonantes+" consonantes.");
    }
}