
package Ejercicio_Clases_29082019_Interfaces_Persona;

import java.util.Scanner;


public class Alumno implements Persona,OrientacionPolitica{
    
    String nombre="";

    @Override
    public void ingresar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = sc.next();
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: "+nombre);
    }

    @Override
    public void capitalista() {
    }

    @Override
    public void comunista() {
    }
    
}
