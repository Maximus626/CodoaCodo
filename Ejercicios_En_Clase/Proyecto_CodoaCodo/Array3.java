
package Proyecto_CodoaCodo;

import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese Nombre");
        String nombre = sc.next();
        
        System.out.println("Ingrese Apellido");
        String apellido = sc.next();
        
        System.out.println("Ingrese DNI");
        String dni = sc.next();
        
        String vector[] = {nombre, apellido, dni};
        
        for (int posicion = 0; posicion < vector.length; posicion++){
        System.out.println("nombre " + posicion+" : " + vector[posicion]);
        }
        
    }
    
}
