
package Ejercicio_Clases_03092019_Factura;

public class Televisor extends Aparato {
    
    private double tamano;
    
    Televisor(){
        
    }
    
    Televisor(int voltaje, double precio, double tamano){
        super(voltaje, precio);
        this.tamano = tamano;
    }
    
    public void setTamano(double tamano){
        this.tamano = tamano;
    }
    public double getTamano(){
        return tamano;
    }
    
    public void capturarTelevisor(){
        
    }
    
    public void imprimirTelevisor(){
        
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nTamano: " + tamano;
    }
}