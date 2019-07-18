
package Ejercicio_Clases_25062019;

import java.util.Scanner;

public class Liquidacion_Sueldo {

    public static String[]ingresoDatos(){
        Scanner ss = new Scanner(System.in);
        Scanner se = new Scanner(System.in);
        String[] empleado = new String[3];
        int empleadonum;
        String nombre;
        int puesto=0;
        
        System.out.println("Ingrese el número del empleado");
        empleadonum= se.nextInt();
        System.out.println("Ingrese el nombre del empleado");
        nombre=ss.nextLine();
        while(puesto<1 || puesto>3){
        System.out.println("Ingrese el puesto del empleado, utilizando:");
        System.out.println("'1' para 'Ingeniero',");
        System.out.println("'2' para 'Técnico',");
        System.out.println("'3' para 'Otros'.");
        puesto=se.nextInt();
        }
        
        empleado[0]=Integer.toString(empleadonum);
        empleado[1]=nombre;
        empleado[2]=Integer.toString(puesto);
        return empleado;
    }
    
    
    public static void mostrarRecibo(String[] empleado){
        final int sueldo1=6800;
        final int sueldo2=4246;
        final int sueldo3=2500;
        final double imp = (0.1);
        int sueldo=0;
        double total;
        String puesto="";
        
        int cargo=Integer.parseInt(empleado[2]);
        switch(cargo){
            case 1:
                sueldo=sueldo1;
                puesto="Ingeniero";
                break;
            case 2:
                sueldo=sueldo2;
                puesto="Técnico";
                break;
            case 3:
                sueldo=sueldo3;
                puesto="Otros";
                break;
            }
        
        total=(double)(sueldo-(sueldo*imp));
        
        System.out.println("Empleado: n°"+empleado[0]);
        System.out.println("Nombre: "+empleado[1]);
        System.out.println("Puesto: "+ puesto);
        System.out.println("Sueldo Neto: "+sueldo);
        System.out.printf("Impuesto: %.1f", (sueldo*imp));
        System.out.println("");
        System.out.printf("TOTAL: %.1f",total);  
        System.out.println("");
    }
   
    
    public static void main(String[] args) {
        mostrarRecibo(ingresoDatos());
    }
}