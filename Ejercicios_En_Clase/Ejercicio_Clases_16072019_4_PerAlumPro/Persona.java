
package Ejercicio_Clases_16072019_4_PerAlumPro;
public class Persona {
    
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;
    
    public Persona(){
        
    }
    
    //Setter y Getter
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getNacionalidad(){
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    
    //Metodo toString
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad
                + "\nNacionalidad: " + nacionalidad;
    }
}