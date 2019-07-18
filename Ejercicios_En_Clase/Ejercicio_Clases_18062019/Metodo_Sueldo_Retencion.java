package Ejercicio_Clases_18062019;

import java.util.Scanner;
public class Metodo_Sueldo_Retencion {

    public static void nombreSueldo(String a, float b){
        
        if (b>=25000){
            float sueldo = (float)(b*0.9);
            System.out.println("El empleado "+ a + " recibirá un sueldo de "+ sueldo);
        }else{
            System.out.println("El empleado "+ a + " recibirá un sueldo de "+b);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado ");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese el sueldo del empelado ");
        float sueldo = sc.nextFloat();
        
        nombreSueldo(nombre, sueldo); 
    }
}