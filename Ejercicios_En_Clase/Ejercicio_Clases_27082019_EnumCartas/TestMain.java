package Ejercicio_Clases_27082019_EnumCartas;

public class TestMain {

    enum Cartas {
        DIAMANTE, CORAZON, TREBOL, FLOR;
    }

    public static void main(String[] args) {
        Cartas tp1;
        tp1 = Cartas.DIAMANTE;
        Cartas tp2;
        tp2 = Cartas.CORAZON;
        Cartas tp3;
        tp3 = Cartas.TREBOL;
        Cartas tp4;
        tp4 = Cartas.FLOR;
        
        System.out.println("Valor del mazo 1 es " + tp1);
        System.out.println("Valor del mazo 2 es " + tp2);
        System.out.println("Valor del mazo 3 es " + tp3);
        System.out.println("Valor del mazo 4 es " + tp4);
    }

}
