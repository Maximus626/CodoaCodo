package Ejercicios_Clases_02072019_POO_02;

public class perrito {

    public static void main(String[] args) {
        perro perrin = new perro();
        perrin.raza = "labrador";
        perrin.tamaño = "mediano";
        perrin.color = "miel";
        perrin.edad = 5;
        
        perrin.mostrar();
        perrin.comer();
        perrin.dormir();
        perrin.ladrar();
    }

}
