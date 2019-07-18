package Ejercicio_Clases_18072019_10_ArrayList;

//import static Ejercicio_Clases_18072019_10_ArrayList.Array_List.cargarLista;
//import static Ejercicio_Clases_18072019_10_ArrayList.Array_List.mostrarLista;
//import static Ejercicio_Clases_18072019_10_ArrayList.Array_List.removerLista;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_Array_List {

 
            public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        Array_List.cargarLista(lista);
        //cargarLista(lista);

        System.out.print("\nIngrese Nombre a eliminar: ");
        String nombre = teclado.next();

        Array_List.removerLista(lista, nombre);

        Array_List.mostrarLista(lista);

    }
        
        
        
    }
    
}
