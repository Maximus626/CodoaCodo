package Actividad_Practica_Unidad_6;

public class Ejercicio_04_10Numeros_Promedio {

    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        double promedio = 0;
        double vector[] = new double[10];
        System.out.println("Numeros del Vector :");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) Math.round(Math.random() * (max - min));
            System.out.print((int) vector[i]+ " ");
            promedio = promedio + vector[i];
        }
        System.out.println("");
        promedio = promedio / vector.length;
        System.out.print("Promedio: " + promedio);
        System.out.println("");
    }

}
