
package Ejercicio_Clases_11062019;

import java.util.Scanner;

public class Sueldo_Neto_PorHoras {
 public static double sueldoNeto(int horas, float salario){
        
        double sueldoBruto =  salario * (double) horas;
        
        double sueldoNeto = 0.9 * sueldoBruto;
        
        return sueldoNeto;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado");
        String nombre = sc.next();
        
        System.out.println("Ingrese las horas trabajadas");
        int horas = sc.nextInt();
        
        System.out.println("Ingrese el salario por hora");
        float salario = sc.nextFloat();
        
        System.out.print("El sueldo Neto de " + nombre + " es: ");
        System.out.printf("%.2f \n", sueldoNeto(horas, salario));
        
    }
}