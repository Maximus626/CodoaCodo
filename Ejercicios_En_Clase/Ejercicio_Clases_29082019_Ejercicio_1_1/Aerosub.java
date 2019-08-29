
package Ejercicio_Clases_29082019_Ejercicio_1_1;

public class Aerosub extends Acuatico implements Aereo{

    /*
    @Override
    public void emerger() {
        System.out.println("El aeroSub está emergiendo del agua...");
    }*/

    /*@Override
    public void sumergir() {
        System.out.println("El aeroSub se está hundiendo en el agua...");
    }*/

    @Override
    public void despegar() {
        System.out.println("El aeroSub está levantando vuelo...");
    }

    @Override
    public void acuatizar() {
        System.out.println("El aeroSub está aterrizando en el agua...");
    }

}