
package Actividad_Practica_Unidad_6;

public class Ejercicio_16_Matriz3x3 {
public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("\nFila n°"+(i+1));
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Columna n°" + (j+1) + ": "+matriz[i][j]+"   ");
            }
        }
    }
}