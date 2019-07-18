package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio27_SueldoAño {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int sueldo;

        do {
            System.out.println("Ingrese el sueldo del mes " + (contador + 1));
            sueldo = sc.nextInt();

            if (sueldo < 0) {
                break;
            }

            contador++;
            suma += sueldo;

        } while (contador < 12);

        System.out.println("El sueldo de " + contador + " meses es: " + suma);

    }
}
