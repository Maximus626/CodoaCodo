
package Ejercicio_Clases_25062019;

import java.util.Scanner;

public class Metodo_Cramer {
 public static int determinante(int[][] matriz){
        int determinante;
        int acum = 1;
        int acum2 = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                //System.out.print(matriz[i][j] + " ");
                if((i == 0 && j == 0) || (i == 1 && j == 1)){
                    acum *= matriz[i][j];
                }
                if ((i == 0 && j == 1) || (i == 1 && j == 0)) {
                    acum2 *= matriz[i][j];
                }
            }
        }
        determinante = acum - acum2;
//        determinanteX(matriz, determinante);
//        determinanteY(matriz, determinante);
        return determinante;
    }
    
    public static int determinanteY(int[][] matriz, int determinante){
        int acum = 1;
        int acum2 = 1;
        int determinanteY;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if((i == 0 && j == 0) || (i == 2 && j == 1)){
                    acum *= matriz[i][j];
                }
                if ((i == 2 && j == 0) || (i == 1 && j == 0)) {
                    acum2 *= matriz[i][j];
                }
            }
        }
        determinanteY = acum - acum2;
        int y = determinanteY / determinante;
//        System.out.println("Resultado Y: " + y);
        
        return y;
    }
    
    public static int determinanteX(int[][] matriz, int determinante){
        int acum = 1;
        int acum2 = 1;
        int determinanteX;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if((i == 2 && j == 0) || (i == 1 && j == 1)){
                    acum *= matriz[i][j];
                }
                if ((i == 2 && j == 1) || (i == 0 && j == 1)) {
                    acum2 *= matriz[i][j];
                }
            }
        }
        determinanteX = acum - acum2;
        int x = determinanteX / determinante;
        //System.out.println("Resultado X: " + x);
        
        return x;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] matriz = new int[3][2];
        
        System.out.println("ax + by = e");
        System.out.println("cx + dx = f");
        
        System.out.println("Ingrese los numeros para \"ax\" ");
        matriz[0][0] = sc.nextInt();
        
        System.out.println("Ingrese los numeros para \"bx\" ");
        matriz[0][1] = sc.nextInt();
        
        System.out.println("Ingrese los numeros para \"cx\" ");
        matriz[1][0] = sc.nextInt();
        
        System.out.println("Ingrese los numeros para \"dx\" ");
        matriz[1][1] = sc.nextInt();
        
        System.out.println("Ingrese los numeros para \"e\" ");
        matriz[2][0] = sc.nextInt();
        
        System.out.println("Ingrese los numeros para \"f\" ");
        matriz[2][1] = sc.nextInt();
        
        int det = determinante(matriz);
        
        
        
        
        System.out.println("Resultado X: " + determinanteX(matriz, det));
        System.out.println("Resultado Y: " + determinanteY(matriz, det));
        
//        System.out.println("Determinante: " + determinante(matriz));
    }
}