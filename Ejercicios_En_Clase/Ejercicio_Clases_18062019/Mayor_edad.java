package Ejercicio_Clases_18062019;

import java.util.Scanner;

public class Mayor_edad {

    public static void ingreso(int edad[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < edad.length; i++) {
            System.out.println("ingrese edad [" + (i+1) + "]");
            edad[i] = sc.nextInt();
        }
        sc.close();
    }
    
    public static int mayor(int edad[], int LARGO){
    int mayor = edad[0];
    int posicion = 0;
    for (int i = 1; i < LARGO; i++){
    if (edad[i] >mayor ){
        mayor = edad[i];
    posicion = i;
    }
    }
    return edad[posicion];
    }
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese largo de vector");
        int largo = sc.nextInt();
        
        int edad[] = new int[largo];
        
        ingreso(edad);
        int num_mayor = mayor(edad, largo);
        System.out.println("El mayor es: "+num_mayor);
        
    }

}
