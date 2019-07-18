
package Ejercicio_Clases_04072019_2;

public class vehiculos {

 public static void main(String[] args) {
        
        vehiculo ferrari = new vehiculo();
ferrari.setmarca("ferrari");
ferrari.setpotencia(2500);
        System.out.println("Marca: "+ferrari.getmarca());
        System.out.println("Velocidad: "+ferrari.getpotencia()+" de potencia");
 }
}

