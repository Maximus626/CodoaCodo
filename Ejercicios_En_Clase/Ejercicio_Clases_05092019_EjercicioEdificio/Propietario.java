
package Ejercicio_Clases_05092019_EjercicioEdificio;

public class Propietario {
    
    private String nombre;
    private Edificio propiedad;
    
    public Propietario(){
        
    }
    
    Propietario(String nombre, Edificio propiedad){
        this.nombre = nombre;
        this.propiedad = propiedad;
    }
    
    public void mostrarPropiedad(){
        System.out.println("Nombre Propietario: " + nombre);
        System.out.println(propiedad.toString());
    }
}