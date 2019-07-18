
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_11_NumAzar_Posicion {

   public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números al azar a obtener:");   
        int largo = sn.nextInt();
        int[] vector = new int[largo];
        System.out.println("Ingrese el rango de números entre los que desea obtener los números");
        System.out.print("Número más bajo: ");
        int min = sn.nextInt();
        System.out.print("Número más alto: ");
        int max = sn.nextInt();
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int) (Math.random() * max + min);
        }
        
        System.out.print("Ingrese la posición que desea dejar en blanco: ");
        int posicion = sn.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
            if ((i+1)==posicion){
                System.out.println("Posición n°"+(i+1)+": POSICIÓN VACÍA");
            }else{
                System.out.println("Posición n°"+(i+1)+": "+vector[i]);
            }
        }
    } 
}