
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_12_ArrayMultiplos {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese el número del cuál quiere saber sus múltiplos:");
        int numero = sn.nextInt();
        
        System.out.println("Ingrese la cantidad de números múltimplos que desea visualizar");
        int largo = sn.nextInt();
        int[] vector = new int[largo];
        vector= rellenarArreglo(numero, largo);
        mostrarArreglo(vector);
    }
    
    public static int[] rellenarArreglo(int num, int largo){
        
        int arreglo[]=new int[largo];
        
        for (int i = 0; i < largo; i++) {
            arreglo[i]= num*(i+1);
        }
        return arreglo;
    }
    
    public static void mostrarArreglo(int[] arreglo){
        System.out.print("Los múltiplos de "+arreglo[0]+" son: ");
        for (int i : arreglo) {
            System.out.print(i+", ");
        }
    }  
}