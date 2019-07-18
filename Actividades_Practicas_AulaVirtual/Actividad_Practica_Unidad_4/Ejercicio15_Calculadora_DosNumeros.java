
package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio15_Calculadora_DosNumeros {

    public static void main(String[] args) {
        // TODO code application logic here
        
       int num2, resultado, resto;
        int num1= 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese primer numero positivo");
            num1 = teclado.nextInt();
        } while (num1==0);
               
        do {
            System.out.println("Ingrese segundo numero positivo");
            num2 = teclado.nextInt();
        } while (num2 == 0); 
        
        System.out.println("que operacion desea realizar?");
        System.out.println("+ | - | x | / |");
        teclado.nextLine();
        String opcion = teclado.nextLine();
        switch (opcion){
            case "+":
                int suma = num1+num2;
                System.out.println("La suma de los dos numeros es: "+suma);
                break;
                case "/":
                float num3, num4;
                num3 = num1;
                num4 = num2;
                float divide = (float)(num3/num4);
                System.out.println("La division de los dos numeros es: "+divide);
                break;
                case "-":
                int resta = num1-num2;
                System.out.println("La resta de los dos numeros es: "+resta);
                break;
                case "x":
                int multi = num1*num2;
                System.out.println("La multiplicacion de los dos numeros es: "+multi);
                break;
                default:
                    System.err.println("Opcion ingresa no es valida");
                
                }
    }
    
}
