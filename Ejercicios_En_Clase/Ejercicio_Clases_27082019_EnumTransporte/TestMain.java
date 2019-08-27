
package Ejercicio_Clases_27082019_EnumTransporte;

public class TestMain {
    enum Transporte {
    COCHE, CAMION, AVION, TREN, BARCO;
    
    }

    public static void main(String[] args) {
        Transporte tp;
       tp = Transporte.AVION;
       if (tp == Transporte.AVION){
           System.out.println(tp+" Tiene el valor de avion");
       }
       
    }
    
}
