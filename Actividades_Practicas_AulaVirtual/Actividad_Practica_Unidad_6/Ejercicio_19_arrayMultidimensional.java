
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_19_arrayMultidimensional {
public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int azul=40;  int verde=35;
        int amar=30;
        int resto;
        String aula;
        
        
        System.out.print("Ingrese la cantidad de alumnos inscriptos para cursar tercer grado: ");
        int cantidad = sn.nextInt();
        while(cantidad>40||cantidad<1){
            System.out.println("La cantidad ingresada es inválida.");
            System.out.println("Ingrese la cantidad de alumnos inscriptos para cursar tercer grado: ");
            cantidad = sn.nextInt();
            if (cantidad>40) {
                System.out.println("Dejen de vaciar la escuela pública che.");
            }
        }
        
        if (cantidad<amar) {
            aula="Amarilla";
            resto=30-cantidad;
        }else if(cantidad>verde){
            aula="Azul";
            resto=40-cantidad;
        }else{
            aula="Verde";
            resto=35-cantidad;
        }
        
        if (resto!=0) {
            System.out.println("Debido a la cantidad de alumnos ingresada, se sugiere utilizar el aula "+aula+" ya que en esa aula quedarán sólo "+resto+ " bancos libres.");
        }else{
            System.out.println("Se sugiere utilizar el aula "+aula+" ya que con la cantidad de "+cantidad+" alumnos inscriptos, se empleará en su plena capacidad.");
        }
    }
}
