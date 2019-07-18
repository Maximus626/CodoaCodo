package Ejercicios_Clases_25062019;

import java.util.Scanner;

public class Ecuacion_Cuadratica {

    public static void main(String[] args) {
        double a = 0;
        Scanner sc = new Scanner(System.in);

        while (a == 0) {
            System.out.println("Ingrese el valor del coeficiente cuatrático de la parábola que sea distinto de 0 ");
            a = sc.nextDouble();
        }

        System.out.println("Ingrese el valor del coeficiente lineal de la parábola");
        double b = sc.nextDouble();

        System.out.println("Ingrese el valor del término independiente de la parábola");
        double c = sc.nextDouble();

        System.out.println("La ecuación de la parábola ingresada es:");
        System.out.println("(" + a + ")*x*x+(" + b + ")*x+" + c);
        resolverCuadratica(a, b, c);

    }

    public static void resolverCuadratica(double a, double b, double c) {

        double disc = (b * b) - (4 * a * c);
        double resultado0, resultado1, resultado2;

        if (disc < 0) {
            System.out.println("La parábola no corta en ningún punto al eje X ya que la resultante es un número complejo");
        } else if (disc == 0) {
            resultado0 = (-b) / (2 * a);
            System.out.println("La única raíz de la ecuación cuadrática es " + resultado0);
        } else {
            resultado1 = ((-b) + Math.sqrt(disc)) / (2 * a);
            resultado2 = ((-b) - Math.sqrt(disc)) / (2 * a);
            System.out.println("Las raíces de la ecuación cuadrática son " + resultado1 + " y " + resultado2);
        }
    }

}
