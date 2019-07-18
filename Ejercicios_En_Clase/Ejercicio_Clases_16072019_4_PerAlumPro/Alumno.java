
package Ejercicio_Clases_16072019_4_PerAlumPro;
public class Alumno extends Persona{
    
    private int legajo;
    
    public Alumno(){
        
    }
    
    //Getter y Setter
    public int getLegajo(){
        return legajo;
    }
    public void setLegajo(int legajo){
        this.legajo = legajo;
    }
    
    //Metodo toString
    @Override
    public String toString(){
        return super.toString() + "\nLegajo: " + legajo;
    }
}