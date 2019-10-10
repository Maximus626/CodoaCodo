package Ejercicio_Clases_03092019_Factura;

public class Aparato {
    
    private int voltaje;
    private double precio;
    
    Aparato(){
        
    }
    
    Aparato(int voltaje, double precio){
        this.voltaje = voltaje;
        this.precio = precio;
    }
    
    public void establecerAparato(int voltaje, double precio){
        this.voltaje = voltaje;
        this.precio = precio;
    }
    
    public void setVoltaje(int voltaje){
        this.voltaje = voltaje;
    }
    public int getVoltaje(){
        return voltaje;
    }
    
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public double getPrecio(){
        return precio;
    }
    
    public double calcularDescuento(double descuento){
        double resultado = precio * descuento / 100;
        return resultado;
    }
    
    @Override
    public String toString(){
        return "Precio: " + precio + "\nVoltaje: " + voltaje;
    }
}