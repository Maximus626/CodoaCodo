package Ejercicios_Clases_06062019;

public class MetodoBurbuja {

    public static void main(String[] args) {
        int a[] = {6, 4, 5, 8, 7};

        int i, j, aux;
        System.out.println("MENOR A MAYOR");

        for (i = 0; i < a.length - 1; i++) {
            for (j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;

                }
            }
        }

        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k] + " en posicion [" + k + "] ");

        }

    }

}
