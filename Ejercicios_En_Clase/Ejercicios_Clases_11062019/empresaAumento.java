package Ejercicios_Clases_11062019;

import java.util.Scanner;

public class empresaAumento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el salario del empleado");
        double salario = sc.nextDouble();
        double aumento = aumentarSalario(salario);
        System.out.printf("El salario con aumento de este empleado es %.2f\n",aumento);
        
    }
    
    public static double aumentarSalario(double salario){
        double aumento = salario*1.25;
        return aumento;
    }
}
