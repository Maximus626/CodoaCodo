
package Proyecto_CodoaCodo;

import java.util.Scanner;

public class Array4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese largo del vector");
        int largo = teclado.nextInt();
        int vector[] = new int [largo];
        int acomulador = 0;
        
        for (int posicion = 0; posicion < largo; posicion++){
            System.out.println("Ingrese numero");
            int numero = teclado.nextInt();
            acomulador += numero;
            vector[posicion] = numero;
        }
        System.out.println("");
        
        for(int i = 0; i<vector.length; i++){
            System.out.println("Los numero ingresados son: " + vector[i]);
            
        }
        System.out.println("");
        System.out.println("La suma de los numero son: " + acomulador);
    }
        
    }