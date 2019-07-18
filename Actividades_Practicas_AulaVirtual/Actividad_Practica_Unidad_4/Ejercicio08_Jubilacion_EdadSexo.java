package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio08_Jubilacion_EdadSexo {

    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        String sexo = "";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese sexo: ");
        sexo = teclado.nextLine();
        System.out.println("Ingrese edad: ");
        edad = teclado.nextInt();

        if (sexo.equals("M") || sexo.equals("m") && edad >= 65) {
            System.out.println("Se Jubila con " + edad + " años de edad");
        } else if (sexo.equals("F") || sexo.equals("f") && edad >= 60) {
            System.out.println("Se jubila con " + edad + " años de edad");
        } else {
            System.out.println("No se jubila con " + edad + " años de edad");
        }
    }
}

