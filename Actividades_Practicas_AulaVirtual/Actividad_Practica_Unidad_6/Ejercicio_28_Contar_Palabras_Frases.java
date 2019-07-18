
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_28_Contar_Palabras_Frases {

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        System.out.println("Ingrese una frase por favor");
        String frase = st.nextLine();

        String[] palabras = frase.split(" ");
        int cantidad = palabras.length;
        for (String palabra : palabras) {
            if (palabra.equals("")) {
                cantidad -= 1;
            }
        }
        System.out.println("La frase ingresada, \n\"" + frase + "\"\n contiene " + cantidad + " palabras.");
    }
}