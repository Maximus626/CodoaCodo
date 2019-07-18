package Ejercicio_Clases_18072019_08_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el largo de la lista");
        int largo = teclado.nextInt();
        teclado.nextLine(); //LimpiaBuffer
        for (int i = 0; i < largo; i++) {
            System.out.println("Posicion N°: [" + i + "]");
            String nombre = teclado.nextLine();
            lista.add(nombre);
        }

        System.out.println("Largo de la lista: " + lista.size());
        System.out.println("Lista de nombres: " + lista);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals("Pedro")) {
                lista.remove(i);
            }

        }
        System.out.println("Nombres: " + lista);

    }

}
