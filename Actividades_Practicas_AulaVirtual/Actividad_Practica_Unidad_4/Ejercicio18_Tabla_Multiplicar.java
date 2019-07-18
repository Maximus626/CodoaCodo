
package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio18_Tabla_Multiplicar {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero para conocer su tabla hasta el 10");
        int num = sc.nextInt();
        
        int i = 0;
        while(i <= 10){
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
    
}