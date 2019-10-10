
package Ejercicio_Clases_03092019_Factura;

public class TestMain {

    public static void main(String[] args) {
      Televisor tv = new Televisor(22, 500.50, 50);
        EquipoMusica equipo = new EquipoMusica(22, 800.90, 5);
        Factura fact = new Factura();
        
        fact.imprimirFact();
    }
}
    

