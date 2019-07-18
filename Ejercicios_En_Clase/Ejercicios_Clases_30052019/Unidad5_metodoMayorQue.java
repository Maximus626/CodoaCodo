package Ejercicios_Clases_30052019;


import java.util.Scanner;

public class Unidad5_metodoMayorQue{
    
static Scanner sc = new Scanner(System.in);
    
    public static int mayor(int num1, int num2){
        
        if (num1 > num2) {
            return num1;
        }else{
            return num2;
        }
    }
    
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();
        
        int resultado = mayor(num1, num2);
        
        System.out.println("EL numero mayor es: " + resultado);
        
      }
}
