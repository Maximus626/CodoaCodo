
package Actividad_Practica_Unidad_5;

import java.util.Scanner;

public class Ejercicio_04_FuncionCubo {
public static int cubo(int a){
        int cubo = a*a*a;
        return cubo;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num1 = sc.nextInt();
        
        System.out.println(num1 + " al cubo es: " + cubo(num1));
    }
}
