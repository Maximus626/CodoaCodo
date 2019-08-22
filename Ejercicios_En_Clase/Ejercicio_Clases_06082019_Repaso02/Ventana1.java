package Ejercicio_Clases_06082019_Repaso02;

public class Ventana1 {

    String marco;
    String vidrio;
    String color;

    public Ventana1(String marco, String vidrio, String color) {
        this.marco = marco;
        this.vidrio = vidrio;
        this.color = color;
    }
    
    

    @Override
    public String toString() {
        return "Ventana1 " + " marco " + marco + " vidrio " + vidrio + " color " + color + '}';
    }
    
    
}
