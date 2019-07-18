
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_14_NumMayor_forEach {

   public static void main(String[] args) {
        int respuesta = 0;
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de valores que tendrá este vector ");
        int largo = sn.nextInt();
        int[] vector = new int[largo];

        do{
            System.out.println("¿Desea cargar de forma manual los valores del vector? \no ¿Desea que sean tomados al azar?");
            System.out.println("Presione 1 para carga manual");
            System.out.println("Presione 2 para carga al azar");
            respuesta = sn.nextInt();
        }while (respuesta != 1 && respuesta != 2);
        switch (respuesta) {
            case 1:
                vector = cargarManual(largo);
                break;
            case 2:
                vector = cargarAzar(largo);
                break;
        } 
        buscarDosMayores(vector);
    }
    

    public static int[] cargarManual(int largo) {
        int respuesta = 1;
        int[] cargado = new int[largo];
        Scanner sc = new Scanner(System.in);
        System.out.println("Usted ha elegido la carga MANUAL.");

        do{
            for (int i = 0; i < cargado.length; i++) {
                System.out.print("Ingrese el valor para la posición n°" + (i + 1) + ": ");
                cargado[i] = sc.nextInt();
            }
            System.out.println("");
            System.out.println("");
            System.out.println("Fueron ingresados los siguientes números: ");
            int posicion = 1;
            for (int i : cargado) {
                System.out.println("Posición n°" + posicion + ": " + i);
                posicion++;
            }
            System.out.println("¿Desea confirmar los números ingresados?");
            System.out.print("Presione 1 para confirmar, \no bien presione cualquier otro número para repetir la carga manual: ");
            respuesta = sc.nextInt();
        } while (respuesta != 1);

        return cargado;
    }

    
    public static int[] cargarAzar(int largo) {
        Scanner sc = new Scanner(System.in);
        int[] cargado = new int[largo];
        int respuesta = 1;
        System.out.println("\nUsted ha elegido carga AL AZAR");
        System.out.println("A continuación elija el rango de números entre los que se hará la función al azar.");
        System.out.print("Ingrese el número para el mínimo: ");
        int min = sc.nextInt();
        System.out.print("Ingrese el número para el máximo: ");
        int max = sc.nextInt();

        do{
            System.out.println("\nSerán ingresados los siguientes números: ");
            for (int i = 0; i < cargado.length; i++) {
                cargado[i] = (int) (Math.random() * max + min);
                if(cargado[i]>max){
                    cargado[i]=(cargado[i]-min);
                }
                System.out.println("Posición n° " + (i + 1) + ": " + cargado[i]);
            }
            System.out.println("¿Desea confirmar estos ingresos?");
            System.out.print("Presione 1 para aceptar, \no bien presione cualquier otro número para repetir la carga al azar: ");
            respuesta = sc.nextInt();
        } while (respuesta != 1);
        return cargado;
    }
    
    
    public static void buscarDosMayores(int[] vector){
        int mayor1 = vector[0];
        int mayor2 = vector[0];
        int posicion1=0;
        int posicion2=0;
        
        System.out.println("A continuación se buscará el número mayor contenido en este array");
        for (int i : vector) {
            if(i >mayor1){
                mayor1=i;
                posicion1=posicion2+1;
            }posicion2++;
        }
        
        for (int i = 0; i < vector.length; i++) {
            
        }
        
        System.out.println("Número mayor encontrado.");
        System.out.println("El mayor de todos, el número "+mayor1+ " se encuentra en la posición n°"+posicion1);
    }
}