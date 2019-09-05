
package Ejercicio_Clases_05092019_EjercicioAgenda;

import java.util.Scanner;

public class TestAgenda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        Scanner cod = new Scanner(System.in);
        
        Agenda agen = new Agenda();
        
        System.out.println("Bienvenido a la agenda de EPEPIT");
        for (int i = 0; i < 30; i++) {
            System.out.print("-");
        }
        

        System.out.print("\nIngrese el largo de la agenda: ");
        int largo = sl.nextInt();
        
        System.out.println("");
        
        for (int i = 0; i < largo; i++) {
            System.out.print("Ingrese el codigo: ");
            int code = cod.nextInt();
            System.out.print("Ingrese el nombre: ");
            String nombre = sn.next();
            
            agen.agregarPersonas(code, nombre);
            
            System.out.println("");
        }
        
        agen.mostrarPersonas();
        
        System.out.println("");
        
        System.out.print("Ingrese el codigo para buscar una persona: ");
        int codigoBus = sc.nextInt();
        
        agen.buscarPersona(codigoBus);
        
        System.out.println("");
        
        System.out.print("Ingrese el codigo para eliminar una persona: ");
        int codigoElim = sc.nextInt();
        
        agen.eliminarPersona(codigoElim);
        
    }

}