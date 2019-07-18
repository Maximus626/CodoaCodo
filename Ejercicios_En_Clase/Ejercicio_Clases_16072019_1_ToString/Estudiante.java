package Ejercicio_Clases_16072019_1_ToString;

public class Estudiante {

//atributos
    private String nombre;
    private int edad;
    private int dni;

//constructor               //argumentos
    public Estudiante(String nombre, int edad, int dni) {
//variables
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;

    }
//metodos getter y setter

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public int getdni() {
        return dni;
    }

    public void setdni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString(){
    return "Nombre:"+nombre+" Edad:"+edad+" DNI:"+ dni;
    }
}
