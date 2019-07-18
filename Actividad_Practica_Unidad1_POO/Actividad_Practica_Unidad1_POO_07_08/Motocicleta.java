package ejercicios_unidad1_POO_07_08;

public class Motocicleta {

    public String matricula;
    public String color;
    public int velocidad;
    public Boolean enMarcha;

    public Motocicleta(String matricula, String color, int velocidad, Boolean enMarcha) {
        this.matricula = matricula;
        this.color = color;
        this.velocidad = velocidad;
        this.enMarcha = enMarcha;
    }

    public void mostrar() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidad + " KM/H");
        System.out.println("Motor Apagado");
        System.out.println("");
    }

    public void arrancar() {

        if (enMarcha = true) {
            System.out.println("Encendida...");
        }
    }

    public void acelerar(int i) {
        System.out.print("Acelerando...");
        for (i = 0; i < 250;) {
            i = i + 50;
            System.out.print(i + "KM/H...");
        }
        System.out.println("Velocidad MAXIMA");
        System.out.println("");
    }

    public void frenar() {
        System.out.println("Se cruza un niño con un balon");
        System.out.println("Frena!!!");
        System.out.println("");
    }

    public void girar() {
        System.out.println("Acelera para tomar la curva y girar");
        System.out.println("");
    }
}
