
package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio01_Area_Perimetro_Cuadrado {
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner teclado = new Scanner(System.in);
       int lado, area, perimetro;
        System.out.println("Ingrese el valor de un lado del cuadrado");
       lado = teclado.nextInt();
       area = lado * lado;
       perimetro = lado * 4;
        System.out.println("el area del cuadrado es: " + area);
        System.out.println("el perimetro del cuadrado es: " + perimetro);
    }
    
}
