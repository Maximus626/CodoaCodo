package Proyecto_CodoaCodo;

import java.util.Scanner;

public class Ejemplo_Break {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        final int centinela = 1;
        int acumulador = 0;
        int nota;

        while (contador < 5) {
            System.out.println("ingrese nota" + contador);
            nota = sc.nextInt();
            acumulador = acumulador + nota;

            if (nota == centinela) {
                break;
            }
            contador = contador + 1;
        }
        System.out.println("suma de  notas: " + acumulador);
    }

}
