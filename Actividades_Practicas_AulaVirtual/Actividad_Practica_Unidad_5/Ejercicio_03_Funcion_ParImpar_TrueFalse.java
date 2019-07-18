package Actividad_Practica_Unidad_5;

public class Ejercicio_03_Funcion_ParImpar_TrueFalse {

    public static void main(String[] args) {

        int num = 34;
        System.out.println(esPar(num));

    }

    public static boolean esPar(int num) {

        int resultado = num % 2;
        return resultado == 0;

    }
}
