package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio13_Numero_Mes {

    public static void main(String[] args) {
        // TODO code application logic here
        int mesN;
        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("Ingrese numero del mes");
            mesN = teclado.nextInt();

            switch (mesN) {
                case (1):
                    System.out.println("El N° " + mesN + " es el mes de ENERO");
                    break;
                case (2):
                    System.out.println("El N° " + mesN + " es el mes de FEBRERO");
                    break;
                case (3):
                    System.out.println("El N° " + mesN + " es el mes de MARZO");
                    break;
                case (4):
                    System.out.println("El N° " + mesN + " es el mes de ABRIL");
                    break;
                case (5):
                    System.out.println("El N° " + mesN + " es el mes de MAYO");
                    break;
                case (6):
                    System.out.println("El N° " + mesN + " es el mes de JUNIO");
                    break;
                case (7):
                    System.out.println("El N° " + mesN + " es el mes de JULIO");
                    break;
                case (8):
                    System.out.println("El N° " + mesN + " es el mes de AGOSTO");
                    break;
                case (9):
                    System.out.println("El N° " + mesN + " es el mes de SEPTIEMBRE");
                    break;
                case (10):
                    System.out.println("El N° " + mesN + " es el mes de OCTUBRE");
                    break;
                case (11):
                    System.out.println("El N° " + mesN + " es el mes de NOVIEMBRE");
                    break;
                case (12):
                    System.out.println("El N° " + mesN + " es el mes de DICIEMBRE");
                    break;
                default:
                    System.out.println("ERROR! NO corresponde a un MES (1-12)");
            }
        } while (mesN == 0 || mesN > 12);

    }

}
