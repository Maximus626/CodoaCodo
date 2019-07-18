package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio09_SillasDiponibles_Alumnos {

    public static void main(String[] args) {
        // TODO code application logic here
        int canSillas, canAlumnos, sobran, faltan;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cantidad de sillas disponibles");
        canSillas = teclado.nextInt();
        System.out.println("Ingrese cantidad alumnos en la sala");
        canAlumnos = teclado.nextInt();
        if (canSillas == canAlumnos) {
            System.out.println("Las sillas son suficiente para todos los alumnos, sobran 0 sillas");
        } else if (canSillas > canAlumnos) {
            sobran = canSillas - canAlumnos;

            System.out.println("Alcanzan las sillas y sobran " + Math.abs(sobran) + " sillas en el salon");
        } else {
            faltan = canAlumnos - canSillas;
            System.out.println("Las sillas no alcanzan faltan " + Math.abs(faltan) + " sillas para todos los alumnos");
        }

    }

}
