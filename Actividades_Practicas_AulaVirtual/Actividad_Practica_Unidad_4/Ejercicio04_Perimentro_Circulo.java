
package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio04_Perimentro_Circulo {

    public static void main(String[] args) {
        // TODO code application logic here
        int diametro;
        double PI = 3.14;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el diametro del circulo");
        diametro = teclado.nextInt();
        int perimetro = (int) ((double) PI * diametro);
        System.out.println("El perimetro del circulo es: " + perimetro);
    }
    
}
