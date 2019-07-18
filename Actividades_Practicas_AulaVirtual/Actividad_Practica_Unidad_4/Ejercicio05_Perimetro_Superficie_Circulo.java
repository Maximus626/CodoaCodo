
package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio05_Perimetro_Superficie_Circulo {

    public static void main(String[] args) {
        // TODO code application logic here
        int radio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese radio del circulo: ");
        radio = teclado.nextInt();
        double perimetro = (Math.PI * (double)radio)*2;
        System.out.println("");
        System.out.println("El perimetro del circulo es: " + perimetro);
        double superfi = (perimetro * radio)/2;
        System.out.println("La superficie del circulo es: " + superfi);
    }
    
}
