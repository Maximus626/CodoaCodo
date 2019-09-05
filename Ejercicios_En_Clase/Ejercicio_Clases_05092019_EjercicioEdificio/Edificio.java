
package Ejercicio_Clases_05092019_EjercicioEdificio;


public class Edificio {
  
    private String direccion;
    private int canDepartamentos;
    private int depRentados;

    public Edificio(){
    
    }
        
    public Edificio(String direccion, int canDepartamentos, int depRentados) {
        this.direccion = direccion;
        this.canDepartamentos = canDepartamentos;
        this.depRentados = depRentados;
    }

    @Override
    public String toString() {
        return "Consorcio Champolin:" + "\nDireccion: " + direccion + "\nCant. Deptos: " + canDepartamentos + "\nCant. Dptos Rentados: " + depRentados;
    }
    
    
    
    
    
    
}
