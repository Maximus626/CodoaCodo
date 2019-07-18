package Ejemplos_Varios;

public class Matriz_Recorrer_Matriz2 {

    public static void main(String[] args) {

        int[][] a = {{6, 7, 5, 0, 4}, {3, 8, 4}, {1, 0, 2, 7}, {9, 5}};

        for (int i = 0; i < a.length; i++) { //número de filas

            for (int j = 0; j < a[i].length; j++) { //número de columnas de cada fila

                System.out.print(a[i][j] + " ");

            }

            System.out.println();

        }

    }

}
