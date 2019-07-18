
package ForEaach;

import java.util.Scanner;

public class For_Each {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int vector[] = new int[5];
        int suma = 0;
        
        for (int i= 0 ; i < vector.length;i++){
            System.out.println("Ingrese 5 valores ["+i+"]");
            vector[i] = sc.nextInt();
        }
        for (int i : vector){
        suma = suma + i;
        }
        System.out.println("La suma es "+suma);
    }
    
}
