
package Ejercicio_Clases_16072019_3_PerProEst;

public class Estudiante extends Persona {
   
    private int legajo;

    public Estudiante(int legajo, String nombre, String apellido, int edad, String nacionalidad) {
        super(nombre, apellido, edad, nacionalidad);
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Estudiante " + "legajo:" + legajo + super.toString();
    }

    
    }


