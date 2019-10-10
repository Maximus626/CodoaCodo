
package Ejercicio_Clases_03092019_Factura;

public class EquipoMusica extends Aparato {
    
    private int cantidadCd;

    EquipoMusica(){
        
    }

    EquipoMusica(int voltaje, double precio, int cantidadCd){
        super(voltaje, precio);
        this.cantidadCd = cantidadCd;
    }
    
    EquipoMusica(int cantidadCd){
        this.cantidadCd = cantidadCd;
    }
    
    public int getCantidadCd(){
        return cantidadCd;
    }
    public void setCantidadCd(int cantidadCd){
        this.cantidadCd = cantidadCd;
    }
    
    public void capturarEquipoMusica(){
        
    }
    
    public void imprimirEquipoMusica(){
        
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nCantidad de Cds: " + cantidadCd; 
    }
    
    
}