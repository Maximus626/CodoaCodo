
package Ejercicios_Clases_11072019_POO_02;

public class Main_Operaciones {

    public static void main(String[] args) {
      Operaciones opera = new Operaciones();
      opera.setnum1(10);
      opera.setnum2(5);
      
      
        System.out.println("La suma de los numero es: "+opera.suma());
        System.out.println("La resta de los numero es: "+opera.resta());
        System.out.println("La multiplicacion de los numero es: "+opera.multi());
    }
    
}
