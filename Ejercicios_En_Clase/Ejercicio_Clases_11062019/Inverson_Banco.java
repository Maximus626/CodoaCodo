
package Ejercicio_Clases_11062019;

import java.util.Scanner;

public class Inverson_Banco {

    public static void main(String[] args) {
       double capital;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese capital a invertir");
        capital = teclado.nextInt();
        double valor = Interes(capital);
        System.out.println("Ud ganara " + valor);
        double total = capital + valor;
        System.out.println("Total final "+ total);
        
    }
    
public static double Interes(double capital){
double inversion = capital * 0.02;
return inversion;
}
}
