
package Ejercicio_Clases_11062019;

import java.util.Scanner;

public class Compra_Auto {
public static double prima(int monto){
        
        double prima = 0.35 * monto;
        
        return prima;
    }
    
    public static double cuota(int monto){
        
        double cuota = (0.65 * monto) / 18;
        
        return cuota;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el monto del auto");
        int monto = sc.nextInt();
        
        System.out.printf("El precio de la prima es: %.2f \n" , prima(monto));
        System.out.printf("El precio de las cuotas es: %.2f \n", cuota(monto));
       
    }
}