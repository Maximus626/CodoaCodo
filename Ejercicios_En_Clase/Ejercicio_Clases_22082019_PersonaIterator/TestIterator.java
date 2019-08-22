
package Ejercicio_Clases_22082019_PersonaIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<>();
       Persona per1 = new Persona("Alberto",847463);
       Persona per2 = new Persona("Daniel",8773635);
       Persona per3 = new Persona("Ramiro",735238);
       
       lista.add(per1);
       lista.add(per2);
       lista.add(per3);
       
       Iterator<Persona> itr = lista.iterator();
       while (itr.hasNext()){
           Persona next = itr.next();
           if (next.equals(per2)){
               System.out.println(" Nombre :"+next.getNombre()+" DNI :"+next.getDni());
           }
       }
    }
    
}
