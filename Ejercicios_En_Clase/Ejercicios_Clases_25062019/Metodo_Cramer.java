
package Ejercicios_Clases_25062019;

import java.util.Scanner;

public class Metodo_Cramer {
 public static void imprimirIngresos(int a[][]){
        System.out.println("Las ecuaciones ingresadas fueron ");
        for (int j = 0; j < 2; j++) {            
                System.out.println(a[j][0]+"x+"+a[j][1]+"y="+a[j][2]);
        }
    } 
    
    public static void calcularCramerX(int a[][]){
        double x;
        double y;
        double dt,dx, dy;
        
        dt=((a[0][0])*(a[1][1]))-((a[0][1])*(a[1][0]));
        
        x=((a[0][2]*a[1][1]))-((a[0][1])*(a[1][2]));
        y=((a[0][0]*a[1][2]))-((a[0][2]*a[1][0]));
        
        dx=(x/(dt));
        dy=(y/(dt));
        
        System.out.println("El valor de x es "+dx);
        System.out.println("El valor de y es "+dy);
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int matriz[][]=new int[2][3];
        for (int i = 0; i < 2; i++) {
            
            System.out.println("Para la "+(i+1)+"° ecuación,");
            System.out.println("Ingrese el valor del primer término, el cual multiplica a 'x'");
            matriz[i][0]=sc.nextInt();
            
            System.out.println("Ingrese el valor del segundo término, el cual multiplica a 'y'");
            matriz[i][1]=sc.nextInt();
            
            System.out.println("Ingrese el valor del resultado de la ecuación ingresada");
            matriz[i][2]=sc.nextInt();
            System.out.println("");
        }
        
        imprimirIngresos(matriz);
       calcularCramerX(matriz);       
    } 
    
}