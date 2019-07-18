
package Ejercicio_Clases_02072019_3;

public class vehiculo {
    public String marca;
    public int potencia;
    public String color;
    public int precio;
    public String modelo;
    public String matricula;

    public void mostrar(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Potencia: " + potencia +" CV");
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
        System.out.println("Matricula: " + matricula);
    }

    public void acelerar(){
        System.out.println("");
    }

    public void frenar(){

    }
}