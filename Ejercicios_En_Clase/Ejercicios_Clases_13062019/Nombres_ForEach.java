
package Ejercicios_Clases_13062019;

import java.util.Scanner;

public class Nombres_ForEach {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombres[] = new String [5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un nombre: ["+(i+1)+"] ");
            nombres[i]= sc.nextLine();
        }
        int cont = 1;
        for (String nombre : nombres) {
            System.out.println("En la posicion "+ cont + " está el nombre "+ nombre+" ");
            cont++;
        }
    }   
}