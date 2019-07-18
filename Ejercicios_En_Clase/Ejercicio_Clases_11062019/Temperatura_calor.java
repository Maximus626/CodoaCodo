
package Ejercicio_Clases_11062019;

import java.util.Scanner;

public class Temperatura_calor {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura actual");
        int fahr = sc.nextInt();
        if(puedeSalir(fahr)){
            System.out.println("Usted puede salir al sol");
        }else{
            System.out.println("Mejor quédese en casa");
        };
    }
    
    public static boolean puedeSalir(int temperatura){
        if (temperatura>=75){
            return true;
        }else {
            return false;
        }
    }
    
}