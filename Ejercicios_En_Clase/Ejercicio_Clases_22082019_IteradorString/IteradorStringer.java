package Ejercicio_Clases_22082019_IteradorString;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteradorStringer {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Rosario");
        names.add("Pedro");
        names.add("Camilo");

        // Obteniendo Iterador
        Iterator<String> namesIterator = names.iterator();

        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }
    }

}
