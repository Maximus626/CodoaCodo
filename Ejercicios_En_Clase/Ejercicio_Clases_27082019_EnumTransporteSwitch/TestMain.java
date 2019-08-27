
package Ejercicio_Clases_27082019_EnumTransporteSwitch;

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
       
       switch(tp) {
        case COCHE:
        System.out.println(tp+" Tiene el valor de coche");
        break;
        case CAMION:
        System.out.println(tp+" Tiene el valor de camion");
        break;
        case AVION:
        System.out.println(tp+" Tiene el valor de avion");
        break;
        case TREN:
        System.out.println(tp+" Tiene el valor de tren");
        break;
        case BARCO:
        System.out.println(tp+" Tiene el valor de barco");
        break;
         
    }
    }
    
}
