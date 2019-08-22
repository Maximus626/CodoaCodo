
package Ejercicio_Clases_22082019_IteratorInterger;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorInterger {

   public static void main(String[] args) {
        List<Integer> num = new LinkedList<>();
        num.add(10);
        num.add(20);
        num.add(7);

        // Obteniendo Iterador
        Iterator<Integer> numIterator = num.iterator();

        while (numIterator.hasNext()) {
            System.out.println(numIterator.next());
        }
    }

}