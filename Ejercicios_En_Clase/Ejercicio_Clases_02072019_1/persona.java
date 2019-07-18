package Ejercicio_Clases_02072019_1;

public class persona {
public String nombre;
public int edad;
public char sexo;
public int dni;

public void mostrar (){
    System.out.println("Mi nombre es "+ nombre+" y tengo " + edad+" años y mi sexo es "+sexo + " y mi dni es "+dni);
}
        
    public void saludo() {

        System.out.println("Hola Mundo POO");
    }

    public void comer() {
        System.out.println("Estoy comendo pizza");
    }
}
