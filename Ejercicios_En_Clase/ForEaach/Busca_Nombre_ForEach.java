
package ForEaach;

import java.util.Scanner;

public class Busca_Nombre_ForEach {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        String vector[] = new String[5];
        String nombre = "";
        
        for (int i= 0 ; i < vector.length;i++){
            System.out.println("Ingrese 5 nombres ["+i+"]");
            vector[i] = sc.nextLine();
        }
        for (String i : vector){

        System.out.println("Nombres;"+ i);
        }
        
    }
    
}
