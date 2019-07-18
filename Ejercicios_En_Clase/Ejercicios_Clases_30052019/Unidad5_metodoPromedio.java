package Ejercicios_Clases_30052019;

import java.util.Scanner;

public class Unidad5_metodoPromedio {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void promedio(){
        int num, largo;
        
        System.out.println("Ingrese el largo del vector: ");
        largo = sc.nextInt();
        int vector[] = new int[largo];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingese el " + (i + 1) + "° numero");
            num = sc.nextInt();
            vector [i] = num;
        }
        
        int suma = 0;
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Numero " + (i + 1) + " es: " + vector[i]);
            suma += vector[i];
        }
        System.out.println("El promedio es: " + ((double) suma / 5));
    }
    
    public static int prom_salida(int suma){
        return suma;
    }
    public static void main(String[] args) {
        promedio();
    }
}
