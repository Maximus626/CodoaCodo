package Ejercicios_Clases_11062019;

import java.util.Scanner;


public class Unidad5_gananciaCapital {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el capital a invertir ");
        double capital = sc.nextDouble();
        double ganancia = calcularGanancia(capital);
        System.out.print("Al invertir un capital de " + capital+ " ");
        System.out.printf("generará al cabo de un mes una ganancia de %.2f", ganancia);
        System.out.printf(" recibiendo en total %.2f\n\r", capital+ganancia);
    }
    
    public static double calcularGanancia(double capital){
        double ganancia= capital *0.02;
        return ganancia;
    }
    
}
