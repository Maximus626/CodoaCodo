
package Actividad_Practica_Unidad_5;

import java.util.Scanner;

public class Ejercicio_09_EsVocal {
 public static boolean esVocal(char letra) {

        boolean resultado;

        switch (letra) {
            case 'A':
                resultado = true;
                break;
            case 'E':
                resultado = true;
                break;
            case 'I':
                resultado = true;
                break;
            case 'O':
                resultado = true;
                break;
            case 'U':
                resultado = true;
                break;
            case 'a':
                resultado = true;
                break;
            case 'e':
                resultado = true;
                break;
            case 'i':
                resultado = true;
                break;
            case 'o':
                resultado = true;
                break;
            case 'u':
                resultado = true;
                break;
            default:
                resultado = false;
                break;

        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una vocal");
        char letra = sc.next().charAt(0);
        
        if(esVocal(letra)){
            System.out.println("La letra " + letra + " es vocal");
        }else{
            System.out.println("La letra " + letra + " no es vocal");
        }

    }
}