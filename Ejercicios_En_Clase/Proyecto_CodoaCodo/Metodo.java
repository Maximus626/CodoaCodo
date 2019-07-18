
package Proyecto_CodoaCodo;

import java.util.Scanner;

public class Metodo {
// metodo
//metodos tipo: 
//VOID (vacio)(no retornan nada.
//INT (entero) retorna un tipo entero (return)
    
    //[modificador][tipo_dato_devuelto][nombe_metodo]([tipo][variable],[tipo][variable2])
    
    //public static void suma(){// metodo de tipo VOID(vacio)
    public static int suma(){// metodo de tipo VOID(vacio)
        Scanner sc = new Scanner(System.in);
        int numero1=0,  numero2=0, resultado=0;
        System.out.println("Ingrese primer valor metodo");
        numero1 = sc.nextInt();
        System.out.println("Ingrese segundo valor metodo");
        numero2 = sc.nextInt();
        
        resultado = numero1 + numero2;
        System.out.println("la suma es: "+resultado);
        return resultado;
       
    }
    
    
    
    public static void main(String[] args) {
        // ejecucion del metodo
         Scanner sc = new Scanner(System.in);
        int numero, resultado1=0;
        System.out.println("Ingrese tercer valor main");
        numero = sc.nextInt();
                
        int suma = suma();
        resultado1 = numero + suma();
               
       //suma();
        
    }
    
    //Metodo
}
