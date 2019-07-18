package Proyecto_CodoaCodo;

import java.util.Scanner;

public class MetodoPromedio {

    public static void ingresar_mostrar() {
        int acomulador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros");
        int cant = sc.nextInt();
        int vector[] = new int[cant];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese numero");
            int num = sc.nextInt();
            acomulador = acomulador + num;
            vector[i] = num;
        }
        for (int i = 0; i < vector.length; i++) {
            int j = vector[i];
            System.out.println("Numeros ingresados: " + j);
        }

        System.out.println("El promedio es: " + acomulador / vector.length);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        ingresar_mostrar();
    }

}
