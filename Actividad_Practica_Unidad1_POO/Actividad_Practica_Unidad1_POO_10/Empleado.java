
package Ejercicios_unidad1_POO_10;

public class Empleado {
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private boolean casado;
    private double salario;
    
    public Empleado(){
        
    }
    
    public Empleado(String nombre, String apellido, String cedula, int edad, boolean casado, double salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nombre + " " + apellido);
        System.out.println("Cedula: " + cedula);
        System.out.println("Edad: " + edad);
        System.out.println("¿Está Casado? " + casado);
        System.out.println("Salario: " + salario);
    }
    
    public double aumentoSalario(int porcentaje){
        double resultado = porcentaje * salario / 100;
        double salarioFinal = resultado + salario;
        return salarioFinal;
    }
    
    public void mostrarClasificacion(){
        if (edad < 21) {
            System.out.println("Clasificación Junior");
        }
        else if(edad > 21 && edad < 34){
            System.out.println("Clasificación Medio");
        }
        else if(edad >= 35){
            System.out.println("Categoria Senior");
        }
    }
}
