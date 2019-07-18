
package ForEaach;

import java.util.Scanner;

public class Muestra_Nombre_ForEach {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String buscado;
        boolean encontrado = false;
        String nombres[] = new String [5];
        
        //Esto es para el ingreso iterado
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un nombre: ["+(i+1)+"] ");
            nombres[i]= sc.nextLine();
        }
        
        // declado contador para poner en qué posición fue encontrado
        int cont = 1;
        for (String nombre : nombres) {
            System.out.println("En la posicion "+ cont + " está el nombre "+ nombre+" ");
            cont++;
        }
        
        //Inicio el buscador y le pongo la posicion para mostrar
        System.out.println("Ingrese el nombre a buscar ");
        buscado = sc.nextLine();
        int posicion = 1;
        
        for (String nombre : nombres) {
            if (buscado.equalsIgnoreCase(nombre)) {
                System.out.println("El nombre "+ buscado + " está en la lista, en la posición "+ posicion);
                encontrado=true;
                posicion++;   
            }
        }
        
        //Como en el bucle anterior se define si fue encontrado o no con el true, por defecto es falso.
        //Acá la condicion se evalúa por el contrario, es decir que si encontrado es verdadero, se evalua como que "no sea verdadero"
        if(!encontrado){
            System.out.println("El nombre "+ buscado + " no se encuentra en la lista");
        }
        
    }
    
}   