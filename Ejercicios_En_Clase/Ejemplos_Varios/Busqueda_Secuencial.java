package Ejemplos_Varios;

public class Busqueda_Secuencial {

    public static int busquedaSecuencial(int[] arreglo, int dato) {

        int posicion = -1;

        for (int i = 0; i < arreglo.length; i++) { // recorremos todo el arreglo

            if (arreglo[i] == dato) { // comparamos el elemento en el arreglo con el buscado

                posicion = i; // si es verdadero guardamos la posición

                break; // detiene el ciclo

            }

        }

        return posicion; // si encuentra, devuelve la 1ra posición encontrada sino -1

    }

    public static void main(String[] args) {

        int[] a = {6, 7, 5, 0, 4};

        System.out.println(busquedaSecuencial(a, 5)); // encuentra en la posición 2

        System.out.println(busquedaSecuencial(a, 10)); // no encuentra, devuelve -1

    }

}
