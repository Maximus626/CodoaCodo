/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_Practica_Unidad_4;

import java.util.Scanner;

/**
 *
 * @author Maximus626
 */
public class Ejercicio20_N_Notas_Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int suma = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuantas notas va a ingresar?");
        int cantidad = sc.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese la " + (i+1) + "º nota");
            int nota = sc.nextInt();
            suma += nota;
        }
        double promedio = (double) suma / (double) cantidad;
        
        System.out.println("El promedio es: " + promedio);
    }
}