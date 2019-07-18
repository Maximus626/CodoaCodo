/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_CodoaCodo;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio_Alberto_Mayor_Menor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nro, nromayor = 0, nromenor = 0, contador = 0;

        System.out.println("Valor Mayor y menor.");
        System.out.println("");

        do {
            contador++;
            System.out.print("Ingrese nro #" + contador + " (0 para finalizar): ");
            nro = teclado.nextInt();
            if (contador == 1) {
                nromayor = nro;
                nromenor = nro;
            } else {
                if (nro > nromayor) {
                    nromayor = nro;
                } else {
                    if (nro < nromenor && nro != 0) {
                        nromenor = nro;
                    }
                }
            }
        } while (nro != 0);
        System.out.println("");
        System.out.println("El número mayor ingresado es = " + nromayor);
        System.out.println("El número menor ingresado es = " + nromenor);
    }
}
