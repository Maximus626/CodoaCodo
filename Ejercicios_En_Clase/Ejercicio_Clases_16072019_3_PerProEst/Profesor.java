
package Ejercicio_Clases_16072019_3_PerProEst;

public class Profesor extends Persona {
    
    private final int cursos;
    
    public Profesor(int cursos, String nombre, String apellido, int edad, String nacionalidad) {
        super(nombre, apellido, edad, nacionalidad);
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Profesor" + "cursos=" + cursos + super.toString();
    }

    
}
