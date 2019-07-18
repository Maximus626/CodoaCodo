
package Ejercicio_Clases_16072019_4_PerAlumPro;
public class Profesor extends Alumno {
    
    private int cursos;
    
    public Profesor(){
        
    }
    
    public int getCursos(){
        return cursos;
    }
    public void setCursos(int cursos){
        this.cursos = cursos;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nCursos: " + cursos;
    }
    
}