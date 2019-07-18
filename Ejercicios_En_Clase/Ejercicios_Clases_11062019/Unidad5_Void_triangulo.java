package Ejercicios_Clases_11062019;

import java.util.Scanner;

public class Unidad5_Void_triangulo {

    
   
    public static void main(String[] args) {
        area_triang();
        
    }
    
    
    
    public static void area_triang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base del triangulo ");
        double base = sc.nextDouble();
        System.out.println("Ingrese el valor de la altura de triangulo ");
        double altura = sc.nextDouble();
        System.out.println("El área del triángulo es "+ (base*altura/2));   
    
    }

    
}
