package Ejemplos_Varios;

public class Duplicar_Valores {

    public static void main(String[] args) {

        int[] x = {1, 2, 3, 4};

        System.out.println("Muestro arreglo x antes de invocar:");

        mostrarArreglo(x);
        duplicarValores(x);

        System.out.println("Muestro arreglo x luego de invocar:");

        mostrarArreglo(x);

    }

    static void duplicarValores(int[] vec) {

        for (int i = 0; i < vec.length; i++) {

            vec[i] *= 2;

        }

    }

    static void mostrarArreglo(int[] a) {

        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");

        }

        System.out.println(""); // Línea en blanco

    }

}
