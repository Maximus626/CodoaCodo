
package Ejercicio_Clases_05092019_EjercicioArticulos;

public class ArticulosPedidos {
    
    private int cantidad;
    private Articulo articulos;
    
    ArticulosPedidos(){
    
    }

    public ArticulosPedidos(int cantidad, Articulo articulos) {
        this.cantidad = cantidad;
        this.articulos = articulos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Articulo getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulo articulos) {
        this.articulos = articulos;
    }
    
    
    
}
