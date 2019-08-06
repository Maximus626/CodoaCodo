package Ejercicio_Clases_06082019_Repaso02;

public class VentanaMain {

    public static void main(String[] args) {

        Ventana vent1 = new Ventana();
        vent1.setMarco("Mediano");
        vent1.setVidrio("Templado");
        vent1.setColor("Oscuro");
        System.out.println("El marco del vidrio es " + vent1.getMarco());
        System.out.println("El tipo de vidrio es " + vent1.getVidrio());
        System.out.println("El color es "+vent1.getColor());
        
    
    Ventana1 vent12 = new Ventana1("Delgado", "No templado", "Transparente");
        System.out.println(vent12.toString());
    
    
    }
    

}
