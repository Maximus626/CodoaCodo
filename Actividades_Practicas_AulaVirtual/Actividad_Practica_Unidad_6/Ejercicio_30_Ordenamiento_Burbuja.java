
package Actividad_Practica_Unidad_6;

import java.util.Scanner;

public class Ejercicio_30_Ordenamiento_Burbuja {
 public static void main(String[] args) {
        int[] nums = ingresarValoresOrdenados();
        imprimirNums(nums);
    }

    public static int[] ingresarValoresOrdenados() {
        Scanner sn = new Scanner(System.in);
        int cant = 0;
        System.out.print("Ingrese la cantidad de valores que quiere ingresar: ");
        cant = sn.nextInt();
        int[] nums = new int[cant];
        System.out.println("Ingrese " + cant + " valores");

        for (int i = 0; i < nums.length; i++) {
            System.out.print((i + 1) + "°: ");
            nums[i] = sn.nextInt(); //Esto va haciendo carga sucesiva
            if (i == (nums.length - 1)) { //arranca el ordenamiento apenas carga el último valor. Lo hice para probar algo diferente.
                int aux;
                for (int j = 0; j < nums.length - 1; j++) {
                    for (int k = 0; k < nums.length - j - 1; k++) {
                        if (nums[k] > nums[k + 1]) {
                            aux = nums[k + 1];
                            nums[k + 1] = nums[k];
                            nums[k] = aux;
                        }
                    }
                }
            }
        }
        return nums;
    }

    public static void imprimirNums(int[] nums) {
        System.out.println("Los números ingresados ordenados de menor a mayor son: ");
        for (int num : nums) {
            System.out.print(num + ", ");
        }
        System.out.println("");
    }
}
