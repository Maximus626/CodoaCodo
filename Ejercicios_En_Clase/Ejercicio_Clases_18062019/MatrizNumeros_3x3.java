
package Ejercicio_Clases_18062019;

import java.util.Scanner;

public class MatrizNumeros_3x3 {

 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println(" Introduzca FILA de 3: ");
 int FILA = sc.nextInt();
 System.out.println("Introduzac COLUMNA de 3: ");
 int COLUMNA = sc.nextInt();
 int VECTOR[][] = new int[FILA][COLUMNA]; //arreglo de 3x3 de 3 filas y 3 columnas
 System.out.println(" Arreglo de 3 x 3");
 System.out.println(" Arreglo de ["+FILA+"] x ["+COLUMNA+"]");
 VECTOR[0][0]= 3;
 VECTOR[0][1]= 4;
 VECTOR[0][2]= 5;
 VECTOR[1][0]= 6;
 VECTOR[1][1]= 7;
 VECTOR[1][2]= 8;
 VECTOR[2][0]= 9;
 VECTOR[2][1]= 10;
 VECTOR[2][2]= 11;
 int FILA_I = 0;
 int COLUMNA_J = 0;
 int COLUMNA_J2 = 0;
 int FILA_I1 = 0;
 System.out.println(" numero : ["+FILA_I+"] ["+COLUMNA_J+++"] : "+VECTOR[0][0]);
 System.out.println(" numero : ["+FILA_I+"] ["+COLUMNA_J+++"] : "+VECTOR[0][1]);
 System.out.println(" numero : ["+FILA_I+++"] ["+COLUMNA_J--+"] : "+VECTOR[0][2]);
 System.out.println(" numero : ["+(FILA_I1 = FILA_I1 + 1)+"] ["+COLUMNA_J2+"] : "+VECTOR[1][0]);
 System.out.println(" numero : ["+FILA_I1+"] ["+COLUMNA_J+++"] : "+VECTOR[1][1]);
 System.out.println(" numero : ["+FILA_I--+"] ["+COLUMNA_J+++"] : "+VECTOR[1][2]);
 System.out.println(" numero : ["+FILA_I--+"] ["+COLUMNA_J+++"] : "+VECTOR[1][2]);
 sc.close();
 }
}