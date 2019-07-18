
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_25_Extrae_Inicial_Juntas {
public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        System.out.println("Ingrese un Nombre y Apellido para tomar sus iniciales ");
        String nombre = st.nextLine();

        System.out.println("Las iniciales del nombre ingresado son " + devolverIniciales(nombre) + ".");
    }

    public static String devolverIniciales(String nombre) {
        String[] cortada = nombre.split(" ");
        String iniciales = "";
        for (String segmento : cortada) {
            if ((segmento.length()) >= 3 && !(segmento.equalsIgnoreCase("del"))) {
                iniciales += segmento.charAt(0);
            }
        }
        iniciales = iniciales.toUpperCase();
        return iniciales;
    }
}