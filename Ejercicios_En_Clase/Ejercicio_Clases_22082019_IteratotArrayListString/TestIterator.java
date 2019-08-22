
package Ejercicio_Clases_22082019_IteratotArrayListString;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

    public static void main(String[] args) {
       ArrayList<String> lista = new ArrayList<>();
       lista.add("ebay");
       lista.add("papel");
       lista.add("google");
       
       Iterator itr = lista.iterator();
       while (itr.hasNext()){
           Object next = itr.next();
           System.out.println(""+next);
           
       }
    }
    
}
