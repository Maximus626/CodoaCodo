package Ejercicio_Clases_18072019_02_ArrayList;

import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(5);
        lista.add(7);

        System.out.println("Largo de la lista: " + lista.size());

        for (int i = 0; i < lista.size(); i++) {
            Integer list = lista.get(i);
System.out.println("N°" + list);
        }
       // System.out.println("N°" + lista);

    }

}
