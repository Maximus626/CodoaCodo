
package Ejercicio_Clases_11062019;

import java.util.Scanner;

public class Cambio_Dolar_Pesos {

   public static double cotizacionDolar(double pesos, float cotizacion){
        
        double cotizacionFinal = pesos / cotizacion;
        
        return cotizacionFinal;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("Ingrese la cantidad de pesos");
        double pesos = sc.nextDouble();
        
        System.out.println("Ingrese la unidad cambiaria");
        float cotizacion = sc.nextFloat();
        
        
        System.out.println("Pesos ingresados: " + pesos);
        System.out.println("Valor en dolares: " + cotizacionDolar(pesos, cotizacion));
        
        
        
        
    }
}