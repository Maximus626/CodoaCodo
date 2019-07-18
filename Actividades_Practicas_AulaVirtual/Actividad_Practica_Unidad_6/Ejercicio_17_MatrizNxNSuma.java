
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_17_MatrizNxNSuma {
public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas y columnas que desea ingresar: ");
        int largo = sn.nextInt();
        int[][] matriz= new int[largo][largo];
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("\nPara la fila n°"+(i+1));
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el valor para la posición "+(j+1)+":");
                matriz[i][j]=sn.nextInt();
            }
        }
        mostrarSumatoria(matriz);
    }
    
    public static void mostrarSumatoria(int[][] a){
        int acum=0;
        System.out.println("A continuación se procederá a sumar los valores de la primer columna");
        for (int i = 0; i < a.length; i++) {
            acum+=+(a[i][0]);
            System.out.print(a[i][0]+" + ");    
        }
        System.out.print("= "+acum);
    }
}