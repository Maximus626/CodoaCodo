
package ejercicio_Clases_29082019_Polimorfismo_Vehiculo;

public class TestMain {

    public static void main(String[] args) {
       Vehiculo barco =  new Barco();
       barco.mostrarCaracteristicas("AZUL", "AD2123", "VELA");
       
     Vehiculo coche = new Coche();
        coche.mostrarCaracteristicas("Verde", "AAA345", "Ruedas");
        
        Vehiculo coche1 = new Coche();
        coche.mostrarCaracteristicas("Amarillo", "AAZ321", "RUEDAS");
        
        Barco b = new Barco();
        b.mostrar(); // Herencia
        
        Vehiculo c = new Barco();
        c.mostrar();
    }
}