
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_24_Capicua_Matematica {
public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int cifras = 0; boolean capicua = true;

        System.out.print("Ingrese un número entero: ");
        int numero = sn.nextInt();
        int num = numero;

        int i = 1;
        while (num / i >= 1) {
            cifras += 1;
            i = i * 10;
        }
        
        int[] valor = new int[cifras];
        i /= 10;
        for (int j = 0; j < valor.length; j++) {
            if (num - i >= 0) {
                valor[j] = (int) num / i;
                num = num - (valor[j] * i);
            }
            i = i / 10;
        }
        System.out.print("El número ingresado, '" + numero + "', es de " + cifras + " cifras y ");

        for (int j = 0; j < (((valor.length) / 2)); j++) {
            if ((valor[j]) != (valor[(valor.length - j - 1)])) {
                capicua = false;
            }
        }
        if (cifras == 1) {
            System.out.println("no puede ser clasificado al tener una única cifra.");
        } else {
            if (!capicua) {
                System.out.print("no es capicúa.");
            } else {
                System.out.print("es capicúa.");
            }
            System.out.println("");
        }
    }
}