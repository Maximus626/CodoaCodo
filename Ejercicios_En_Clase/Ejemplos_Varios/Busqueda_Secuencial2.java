package Ejemplos_Varios;

public class Busqueda_Secuencial2 {

    public static String busquedaSecuencial2(int[] arreglo, int valor) {

        String posicion = "";

        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] == valor) {

                posicion += i + " ";

            }

        }

        return posicion;

    }

    public static void main(String[] args) {

        int[] a = {6, 7, 5, 5, 4};

        System.out.println(busquedaSecuencial2(a, 5)); // encuentra en la posición 2 y 3

        System.out.println(busquedaSecuencial2(a, 10)); // no encuentra, devuelve una cadena en blanco

    }

}
