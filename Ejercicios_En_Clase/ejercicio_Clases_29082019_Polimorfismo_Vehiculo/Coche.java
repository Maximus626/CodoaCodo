
package ejercicio_Clases_29082019_Polimorfismo_Vehiculo;


public class Coche extends Vehiculo {

    @Override
    public void mostrarCaracteristicas(String color, String patente, String traccion) {
        System.out.println("Color: "+color+" Patente: "+patente+" Traccion: "+traccion);
    }
    
}
