package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio23_valorMax_valorMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int mayor = 0;
        int menor = 0;
        int contador = 1;
        do {
            System.out.println("Ingrese un numero entero (Ingrese 0 para salir)");
            num = sc.nextInt();
            if (contador == 1) {
                 contador = 10;
                mayor = num;
                menor = num;
              System.out.println("Menor paso1 "+menor);
            System.out.println("Mayor paso1 "+mayor);
                System.out.println("Contador " + contador);
           
            }
            
            

            if (num < mayor && num != 0) {
                menor = num;
            System.err.println("Menor ahora "+menor);
            
            }

            if (num >mayor) {
                mayor = num;
            
            System.err.println("Mayor ahora "+mayor);
            }
            
            
             System.out.println("Menor ahora "+menor);
            System.out.println("Mayor ahora "+mayor);
            
            

        } while (num != 0);

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }

}
