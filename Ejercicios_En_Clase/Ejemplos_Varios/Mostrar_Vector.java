package Ejemplos_Varios;

public class Mostrar_Vector {

    public static void main(String[] args) {
        int[] vueltas = {64, 62, 65, 68, 63, 65};

        int ultimaPosicion = vueltas.length - 1;

        System.out.println("Arreglo original");

        mostrarArreglo(vueltas);

        vueltas[0] = 50;

        vueltas[3] = 70;

        vueltas[ultimaPosicion] = 60;

        System.out.println("Arreglo modificado");

        mostrarArreglo(vueltas);

    }

    static void mostrarArreglo(int[] a) {

        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");

        }

        System.out.println(""); // Línea en blanco

    }

}
