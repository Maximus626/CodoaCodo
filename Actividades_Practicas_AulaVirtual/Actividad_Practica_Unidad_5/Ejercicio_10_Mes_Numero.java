
package Actividad_Practica_Unidad_5;

import java.util.Scanner;

public class Ejercicio_10_Mes_Numero {
 public static String mes(int mes) {
        String mes_respuesta;

        switch (mes) {
            case 1:
                mes_respuesta = "Enero";
                break;
            case 2:
                mes_respuesta = "Febrero";
                break;
            case 3:
                mes_respuesta = "Marzo";
                break;
            case 4:
                mes_respuesta = "Abril";
                break;
            case 5:
                mes_respuesta = "Mayo";
                break;
            case 6:
                mes_respuesta = "Junio";
                break;
            case 7:
                mes_respuesta = "Julio";
                break;
            case 8:
                mes_respuesta = "Agosto";
                break;
            case 9:
                mes_respuesta = "Septiembre";
                break;
            case 10:
                mes_respuesta = "Octubre";
                break;
            case 11:
                mes_respuesta = "Noviembre";
                break;
            case 12:
                mes_respuesta = "Diciembre";
                break;
            default:
                mes_respuesta = "Mes inexistente";
                break;
        }
        return mes_respuesta;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero del mes");
        int mes = sc.nextInt();

        System.out.println(mes(mes));
    }
}