package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio16_10Numero_Siguentes {

    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero para conocer los 10 numero siguentes");
        numero = teclado.nextInt();
       
        for (int i = 0; i < 10; i++) {
            numero = numero + 1;
        System.out.println("Numero siguente es: " + numero);
        }
    }

}
