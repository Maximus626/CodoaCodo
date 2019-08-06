package Ejercicio_Clases_06082019_Repaso01;

public class Persona {

    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    public void mostrar(){
        System.out.println("Nombre "+ nombre+ " Edad "+edad);
    }
            
}
