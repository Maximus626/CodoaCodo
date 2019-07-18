
package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio06_Superficie_Perimetro_Triangulo {

    public static void main(String[] args) {
        // TODO code application logic here
        int lado1, lado2, base;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese lado 1 del triangulo: ");
        lado1 = teclado.nextInt();
        System.out.println("Ingrese lado 2 del triangulo: ");
        lado2 = teclado.nextInt();
        System.out.println("Ingrese base del triangulo: ");
        base = teclado.nextInt();
        int superfi = (lado1 * base)/2;
        System.out.println("La superficie del triangulo es: " + superfi);
        double hipotenu = Math.sqrt(Math.pow(base,2)+ Math.pow(lado1,2));
        double perime = base+lado1+hipotenu;
        System.out.println("El perimetro del triangulo es: " + perime);
         
    }
    
}
