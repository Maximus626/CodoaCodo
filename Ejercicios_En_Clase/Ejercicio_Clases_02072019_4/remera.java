
package Ejercicio_Clases_02072019_4;


public class remera {
    
    //Atributo
    public String color;
    public String descripcion;
    public int precio;
    public String talle;
    
    //Acciones
    public void mostrar(){
        System.out.println("La remera es de color: " + color);
        System.out.println("La remera es: " + descripcion);
        System.out.println("La remera cuesta: " + precio + "$");
        System.out.println("La remera es de talle: " + talle);
    }
    
    
}