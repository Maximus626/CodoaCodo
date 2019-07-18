package Ejercicio_Clases_18072019_07_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el largo de la lista");
        int largo = teclado.nextInt();

        for (int i = 0; i < largo; i++) {
            System.out.println("Posicion N°: [" + i + "]");
            int num = teclado.nextInt();
            lista.add(num);
        }
        
        System.out.println("Largo de la lista: " + lista.size());
        System.out.println("Lista de numeros: "+lista);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(7)) {
                lista.remove(i);
            }

        }
        System.out.println("N°: " + lista);

    }

}
