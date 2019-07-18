
package Ejercicios_Clases_02072019_POO_01;

public class saludo {
 public String nombre;
    public int edad;
    public char sexo;
    public int dni;

    public void mostrar() {
        System.out.println("Hola mundo del POO");
        System.out.println("mi nombre es " + nombre + " tengo " + edad + " años de edad, mi sexo es " + sexo + " y mi dni es "+dni);
    }

    public void comer() {

        System.out.println("estoy comiendo pizza");
    }
}