
package Ejercicio_Clases_05092019_EjercicioAgenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    
    
    ArrayList<Persona> personas = new ArrayList<>();
    
    Agenda() {

    }
      
    public void mostrarPersonas() {
        for (int i = 0; i < personas.size(); i++) {
            System.out.println("Codigo: " + personas.get(i).getCodigo() + " | Nombre: " + personas.get(i).getNombre());
        }
    }

    public void agregarPersonas(int codigo, String nombre) {
        Persona per = new Persona(codigo, nombre);

        if (personas.add(per)) {
            System.out.println("¡Se agrego con exito!");
        } else {
            System.err.println("Error en agregar");
        }
    }

    public void eliminarPersona(int codigo) {

        boolean borrado = false;
        int pos = 0;

        for (int i = 0; i < personas.size(); i++) {

            if (personas.get(i).getCodigo() == codigo) {
                personas.remove(i);
                borrado = true;
                pos = i;
            } else {
                borrado = false;
            }
        }

        if (borrado) {
            System.out.println("Se removio con exito [" + pos + "]");
        } else {
            System.err.println("Error! Codigo no encontrado!");
        }
    }

    public void buscarPersona(int codigo) {

        boolean encontrado = false;
        int indice = 0;

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getCodigo() == codigo) {
                indice = i;
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Encontrado!");
            System.out.println("Nombre: " + personas.get(indice).getNombre() + " | Codigo: " + personas.get(indice).getCodigo());
        } else {
            System.err.println("No encontrado");
        }
    }
}
    

