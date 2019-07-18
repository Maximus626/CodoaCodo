package Ejercicio_Clases_18072019_06_ArrayList;

import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Troy");
        lista.add("Pedro");
        lista.add("Ema");

        System.out.println("Largo de la lista: " + lista.size());
        System.out.println("Lista de Nombres: " + lista);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals("Pedro")) {
                lista.remove(i);
            }
            String list = lista.get(i);
            System.out.println("Nombre: " + list);
        }
        System.out.println("Lista de Nombres: " + lista);

    }

}
