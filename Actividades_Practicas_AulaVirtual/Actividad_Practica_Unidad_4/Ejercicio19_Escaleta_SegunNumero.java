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
public class Ejercicio19_Escaleta_SegunNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
		Scanner teclado = new Scanner(System.in);
		int contador1;
		int contador2;
		int fila;
		int fila2;
		System.out.println("ingrese largo de la escalera");
		fila = teclado.nextInt();
		fila2 = fila;
		for (contador1=1;contador1<=fila;contador1++) {
			for (contador2=1;contador2<=fila2;contador2++) {
				if (contador1==contador2 || contador1<contador2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
			fila = fila-1;
		}
    }
    
}
