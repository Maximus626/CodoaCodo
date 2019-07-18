package Ejercicios_Clases_11062019;

import java.util.Scanner;

public class Unidad5_compraAuto {
    
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
        
        System.out.println("El precio de la prima es: " + prima(monto));
        System.out.printf("El precio de las cuotas es: %.2f \n", cuota(monto));
        
        
        
    }
}
