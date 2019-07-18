package Ejercicios_unidad1_POO_06;

public class Gato {

    public String nombre;
    public String raza;
    public String color;

    public Gato(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }

    public void mostrar() {
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Soy de la raza " + raza);
        System.out.println("Soy de color " + color);
        System.out.println("");
    }

    public void maullar() {
        System.out.println("miauuuu prrrr miauuu!!!");
        System.out.println("");
    }

    public void caminar() {
        System.out.println("Me gusta caminar y mirar todo");
        System.out.println("");
    }

    public void jugar() {
        System.out.println("Estoy jugando con una pelota");
        System.out.println("");
    }

    public void saltar() {
        System.out.println("Cuando me emociono o me asusto salto muy alto");
        System.out.println("");
    }

}
