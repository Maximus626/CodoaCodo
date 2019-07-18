
package ejercicios_unidad1_POO_07_08;

public class Main_Motocicleta {

    public static void main(String[] args) {
        Motocicleta motito = new Motocicleta("OJT 123", "Negra", 250, Boolean.FALSE);
        motito.mostrar();
        motito.arrancar();
        motito.acelerar(0);
        motito.frenar();
        motito.girar();
    }
    
}
