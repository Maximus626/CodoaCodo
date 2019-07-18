package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_06_N_Numeros_Buscar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int largo;
        int buscado;
        boolean encontrado = false;
        System.out.print("Ingrese largo del vector: ");
        largo = sc.nextInt();
        int numeros[] = new int[largo];
        System.out.println("");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + (i + 1) + "]" + "Numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("");
        int cont = 1;
        for (int numero : numeros) {
            System.out.println("Posicion["+ cont + "]: " + numero);
            cont++;
        }
        System.out.println("");
        System.out.print("Numero a buscar: ");
        buscado = sc.nextInt();
        int posicion = 1;
        int lugar = 0;
        System.out.println("");
        for (int numero : numeros) {
            if (buscado == numero) {

                lugar = posicion;
                System.out.print("Numero [" + buscado + "] encontrado en la posicion[" + posicion + "]");
                encontrado = true;
            }
            posicion++;
        }

        if (!encontrado) {
            System.err.println("Numero [" + buscado + "] no se encuentra en la lista");
            System.out.println("");
        }

    }

}
