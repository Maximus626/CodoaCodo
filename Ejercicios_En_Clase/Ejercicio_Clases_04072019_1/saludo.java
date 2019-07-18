
package Ejercicio_Clases_04072019_1;

public class saludo {
public static void main(String[] args) {
       persona dani = new persona();
       dani.setnombre("dani");
       dani.setedad(32);
       System.out.println("Nombre: "+dani.getnombre());
       System.out.println("Edad: "+dani.getedad());    
    }
    
}