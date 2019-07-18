
package Actividad_Practica_Unidad_4;

import java.util.Scanner;

public class Ejercicio11_Tipo_Traingulo {

    public static void main(String[] args) {
        int lado1, lado2, lado3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese lado 1 del triangulo");
        lado1 = teclado.nextInt();
        System.out.println("Ingrese lado 2 del triangulo");
        lado2 = teclado.nextInt();
        System.out.println("Ingrese lado 3 del triangulo");
        lado3 = teclado.nextInt();
        if(lado1 == lado2 && lado1 == lado3){
            System.out.println("Es un triangulo equilatero");
        }else if(lado1== lado2 && lado1 != lado3 || lado2 == lado3 && lado1 != lado2 || lado3== lado1 && lado2 != lado3 ){ 
            System.out.println("El triangulo es isoseles");
        }else{
            System.out.println("El triangulo es escaleno");
        }
        
    }
    
}
