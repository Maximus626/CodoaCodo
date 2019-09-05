
package Ejercicio_Clases_05092019_EjercicioEdificio;

public class TestEdificio {

    public static void main(String[] args) {
       
        Edificio edificio = new Edificio("La niebla 3829", 40, 25);
        Propietario troy = new Propietario("Troy", edificio);
        
        troy.mostrarPropiedad();
        
    }
    
}
