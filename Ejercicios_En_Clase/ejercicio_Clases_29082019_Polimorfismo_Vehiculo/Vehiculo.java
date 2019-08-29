
package ejercicio_Clases_29082019_Polimorfismo_Vehiculo;

public abstract class Vehiculo { //CLASE PADRE O SUPER CLASE
  String nombre ="Daniel"; 
    
public abstract void mostrarCaracteristicas(String color, String patente, String traccion);//plantilla
    
    public void mostrar(){
        System.out.println("Nombre: "+nombre);
    } 
} 
    
    

