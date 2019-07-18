
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_29_MayuscMinusc_MinuscMayusc {
public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        System.out.println("Ingrese su nombre y apellido:");
        String nombre = st.nextLine();

        System.out.println("Su nombre es \"" + presentarNombres(devolverNombres(nombre)) + "\"");
    }

    public static String[] devolverNombres(String nombre) {
        String[] nombrePre = nombre.split(" ");
        int cont = 0;

        for (String buffer : nombrePre) {
            if ((!buffer.isEmpty())) {
                cont++;
            }
        }

        String[] nombrePost = new String[cont];
        int pos = 0;

        for (int i = 0; i < nombrePre.length; i++) {
            if (!(nombrePre[i].isEmpty())) {
                nombrePost[pos] = nombrePre[i];
                pos += 1;
            }
        }
        return nombrePost;
    }

    public static String presentarNombres(String[] nombrePost) {
        String[][] matriz = new String[nombrePost.length][2];
        String definitivo = "";

        for (int j = 0; j < matriz.length; j++) {

            matriz[j][0] = (nombrePost[j].substring(0, 1)).toUpperCase();
            if (!(matriz[j][0].isEmpty())) {
                matriz[j][1] = (nombrePost[j].substring(1).toLowerCase());
            }

            if (j <= matriz.length - 2) {
                definitivo += matriz[j][0] + matriz[j][1] + " ";
            } else {
                definitivo += matriz[j][0] + matriz[j][1];
            }
        }
        return definitivo;
    }
}