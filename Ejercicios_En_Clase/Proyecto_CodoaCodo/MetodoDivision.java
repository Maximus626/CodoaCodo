
package Proyecto_CodoaCodo;

import java.util.Scanner;

public class MetodoDivision {

    public static void dividiendo(){
        double num1=0, num2=0;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Ingrese numero 1");
        num1 = sc.nextInt();
    }while (num1 == 0);
        
        do{
        System.out.println("Ingrese numero 2");
        num2 = sc.nextInt();
    }while(num2 == 0);
       
        System.out.println("El promedio de los numero es "+ num1/num2);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        dividiendo();
    }
    
}
