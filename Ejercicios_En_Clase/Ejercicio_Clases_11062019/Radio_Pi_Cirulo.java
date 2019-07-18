
package Ejercicio_Clases_11062019;

import java.util.Scanner;

public class Radio_Pi_Cirulo {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Igrese el area para saber su radio");
        double radio = teclado.nextInt();
       double area = AreaCirculo(radio);
        System.out.println("El area del circulo es: "+ area);
       
    }
    
    public static double AreaCirculo (double radio){
        final double pi = 3.141516;
        
   
    
    double area = pi * radio * radio ;
    return area;
    }
    
}
