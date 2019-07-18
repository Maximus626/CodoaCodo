package Proyecto_CodoaCodo;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        // TODO code application logic here
//++++++++++++++++Ejercicio1++++++++++++++++++++
//        int vector[] = {1,2,3,4,5,6,7,8};
//        System.out.println("" + vector[0]);
//        System.out.println("" + vector[1]);
//        System.out.println("" + vector.length);

//++++++++++++++++Ejercicio2++++++++++++++++++++
//        int vector[] = new int[8];
//
//        vector[0] = 1;
//        vector[1] = 2;
//        vector[2] = 3;
//        vector[3] = 4;
//        vector[4] = 5;
//        vector[5] = 6;
//        vector[6] = 7;
//        vector[7] = 8;
//
//        System.out.println("" + vector[0]);
//        System.out.println("" + vector[1]);
//        System.out.println("" + vector.length);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = sc.next();

        System.out.println("Ingrese apellido: ");
        String apellido = sc.next();
        
        String vectorSc[] = {nombre, apellido};
        
        System.out.println("nombre " + vectorSc[0]);
        System.out.println("apellido " + vectorSc[1]);
        System.out.println("Largo " + vectorSc.length);

    }

}
