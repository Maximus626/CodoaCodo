package Ejercicios_Clases_11062019;

import java.util.Scanner;

public class Unidad5_metodoBoolean {
    
    public static boolean permiso(int edad){
        
        if (edad >= 13 && edad <= 18) {
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la edad");
        int edad = sc.nextInt();
        
        if (permiso(edad)) {
            System.out.println("Puede entrar al futbol juvenil");
        }else{
            System.out.println("No puede entrar al futbol juvenil");
        }
    }
}
