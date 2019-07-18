package Proyecto_CodoaCodo;

import java.util.Scanner;

public class MetodoDivision2 {

    public static int dividiendo2(int num1, int num2) {

        int resultado = num1 / num2;
        return resultado;
    }

public static void main(String[] args) {
        // TODO code application logic here
        int nume1, nume2, resultado;
         Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese numero 1");
            nume1 = sc.nextInt();
        } while (nume1 == 0);

        do {
            System.out.println("Ingrese numero 2");
            nume2 = sc.nextInt();
        } while (nume2 == 0);
        resultado = dividiendo2(nume1,nume2);
    System.out.println("El resultado es: "+ resultado);
}

}
