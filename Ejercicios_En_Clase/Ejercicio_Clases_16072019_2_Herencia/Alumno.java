
package Ejercicio_Clases_16072019_2_Herencia;

public class Alumno extends Persona {//clase hijo
    
    private String matricula;

    public Alumno(String matricula,String nombre, int edad) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
    
        return super.toString()+" Alumno " + "Matricula:" + matricula + '}';
    }

    
   
}
