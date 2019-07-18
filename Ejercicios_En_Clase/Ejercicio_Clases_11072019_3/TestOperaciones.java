
package Ejercicio_Clases_11072019_3;

public class TestOperaciones {

    public static void main(String[] args) {
        Operaciones opera = new Operaciones(10, 15);
      int suma = opera.suma();
        System.out.println("Suma: "+suma);
        int resta = opera.resta();
        System.out.println("Resta: "+resta);
        int multi = opera.multi();
        System.out.println("Multi: "+multi);
    }
    
}
