
package Ejercicio_Clases_22082019_IteratorArrayListInteger;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

    public static void main(String[] args) {
         ArrayList a1 = new ArrayList();

        for (int i = 0; i < 10; i++) {
            a1.add(i);  // agregar valores
        }
                System.out.println("For : ");
        System.out.println(a1);//mostrar los valores del arraylist
        //al principio itr(cursor) apuntara al indice justo antes
        Iterator itr = a1.iterator();
        //verificando la disponibilidad delsiguente elemento
        System.out.println("Interator: ");
        while (itr.hasNext())
        {
            //mueve el cursor al siguente elemento
            int i = (Integer)itr.next(); //casteo a tpo entero
            //obteniendo elementos iguales a uno por uno
            System.out.println(i + " ");
            
            //eliminando elementos impares
                         itr.remove();
        }    
        System.out.println();
        System.out.println("Removiendo elementos impares: ");
        System.out.println(a1);
    }
}