
package Actividad_Practica_Unidad_5;

import java.util.Scanner;

public class Ejercicio_06_Numero_Mayor {
public static int mayor(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3) {
            return num1;
        }else if(num2 > num1 && num2 > num3){
            return num2;
        }else if(num3 > num1 && num3 > num2){
            return num3;
        }
        
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero");
        int num3 = sc.nextInt();
        
        System.out.println("El numero mayor es: " + mayor(num1, num2, num3));
    }
}