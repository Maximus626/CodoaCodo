
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_15_BuscarClientes {

   public static void main(String[] args) {
        String[] clientes;
        clientes = ingresarClientes(5);

        buscarClientes(clientes);

    }

    public static String[] ingresarClientes(int a) {
        Scanner st = new Scanner(System.in);
        System.out.println("Ingrese los clientes en el sistema");
        String[] clientes = new String[a];
        for (int i = 0; i < clientes.length; i++) {
            System.out.print("Ingrese el nombre del cliente n°" + (i + 1) + ": ");
            clientes[i] = st.nextLine();
        }
        return clientes;
    }

    public static void buscarClientes(String[] clientes) {
        Scanner sb = new Scanner(System.in);
        boolean respuesta = true;
        Scanner sr = new Scanner(System.in);

        do {
            int posicion = 0, posEnc = 0;
            String buscado = "";
            boolean encontrado = false;
            System.out.print("Ingrese el nombre del cliente a buscar en el sistema: ");
            buscado = sb.nextLine();

            for (String cliente : clientes) {
                if (buscado.equalsIgnoreCase(cliente)) {
                    encontrado = true;
                    posEnc = posicion+1;
                }
                posicion++;
            }
            if (encontrado) {
                System.out.println("\nEl nombre '" + buscado + "' fue encontrado en la posición n°" + posEnc);
            } else {
                System.out.println("\nEl nombre '" + buscado + "' no ha sido hallado en nuestros registros.");;
            }
            System.out.println("\n¿Desea realizar otra búsqueda?");
            System.out.print("Presione '1' para realizar otra búsqueda");
            System.out.print("o bien presione '2' para abandonar");
            if (sr.nextInt() != 1) {
                respuesta = false;
            }
        } while (respuesta);
    }
}
