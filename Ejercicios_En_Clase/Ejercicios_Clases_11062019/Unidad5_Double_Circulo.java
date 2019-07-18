
package Ejercicios_Clases_11062019;

import java.util.Scanner;

public class Unidad5_Double_Circulo {
    
    public static double circulo(double radio){
        final double PI = 3.14159265359;
        
        double area = PI * radio * radio;
        
        return area;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el radio del circulo");
        double radio = sc.nextDouble();
        
//        System.out.println("Ingrese pi");
//        double pi = sc.nextDouble();
        
        System.out.println("El area del circulo es: " + circulo(radio));
        
        
        
    }
}
