
package Ejercicio_Clases_29082019_Ejercicio_1;


public class Aerosub implements Aereo,Acuatico{

    @Override
    public void emerger() {
        System.out.println("El ganso emergio a tomar aire");
    }

    @Override
    public void sumerger() {
        System.out.println("El ganso se sumergio otra vez");
    }

    @Override
    public void despegar() {
        System.out.println("El ganso se fue volando a otra rio");
    }

    @Override
    public void acuatizar() {
        System.out.println("Acuatizo en el nuevo rio");
    }
    
}
