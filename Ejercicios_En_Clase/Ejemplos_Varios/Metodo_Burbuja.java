package Ejemplos_Varios;

public class Metodo_Burbuja {

    public static void burbuja(int[] A) {

        int i, j, aux;

        for (i = 0; i < A.length - 1; i++) {

            for (j = 0; j < A.length - i - 1; j++) {

                if (A[j + 1] < A[j]) {

                    aux = A[j + 1];

                    A[j + 1] = A[j];

                    A[j] = aux;

                }

            }

        }

    }

    public static void mostrarVector(int[] v) {

        for (int i : v) {

            System.out.print(i + " ");

        }

        System.out.println("");

    }

    public static void main(String[] args) {

        int[] vector = {50, 26, 7, 9, 15, 27};

        mostrarVector(vector);

        burbuja(vector);

        mostrarVector(vector);

    }

}
