
package Ejercicio_Clases_03092019_Factura;

public class Factura {
    
    private int numero;
    private Televisor tv;
    private EquipoMusica equipo;
    private double descuento;
    
    Factura(){
        
    }
    
    Factura(int numeroFactura, Televisor tv, EquipoMusica equipo,double descuento){
        this.numero = numeroFactura;
        this.tv = tv;
        this.equipo = equipo;
        this.descuento = descuento;
    }
    
    public void capturarDctoTv(Televisor tv){
        tv.calcularDescuento(descuento);
    }
    
    public void capturarDctoEquipo(EquipoMusica equipo){
        equipo.calcularDescuento(descuento);
    }
    
    public void imprimirFact(){
        System.out.println("Factura: " + numero);
        System.out.println("Televisor Tamanio: " + tv.getTamano());
        System.out.println("Equipo de Musica (Cantidad de CD): " + equipo.getCantidadCd());
        System.out.println("----------------------");
        System.out.println("Precios con descuento de " + descuento + "%");
        System.out.println("Televisor: " + tv.calcularDescuento(descuento));
        System.out.println("Equipo de Musica: " + equipo.calcularDescuento(descuento));
        
    }

   
    
    
    
    
}