package Ejercicio_Clases_02072019_2;

public class perro {
public String raza;
public String tamaño;
public String color;
public int edad;

public void mostrar(){
    System.out.println("Mi raza es "+ raza+" soy de tamaño " + tamaño+" mi color es "+color + " y tengo "+edad+ " de edad");
}
        
    public void comer() {

        System.out.println("Me estoy comiendo un huesito");
    }

    public void dormir() {
        System.out.println("Me voy a dormir cuando siento sueño");
        
    }
    public void ladrar() {
        System.out.println("Me encanta ladrar y aullaaaaaaaaaaar");
    }
}