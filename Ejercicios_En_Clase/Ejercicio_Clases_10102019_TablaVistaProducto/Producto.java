/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Clases_10102019_TablaVistaProducto;

public class Producto {
    
private String Id;
private String Producto;
private String Precio;

    public Producto(String Id, String Producto, String Precio) {
        this.Id = Id;
        this.Producto = Producto;
        this.Precio = Precio;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }
    
}
