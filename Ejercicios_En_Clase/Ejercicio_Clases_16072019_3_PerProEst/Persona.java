
package Ejercicio_Clases_16072019_3_PerProEst;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;

    public Persona(String nombre, String apellido, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return " Persona " + "nombre:" + nombre + " apellido:" + apellido + " edad:" + edad + " nacionalidad:" + nacionalidad;
    }

   
    
}
