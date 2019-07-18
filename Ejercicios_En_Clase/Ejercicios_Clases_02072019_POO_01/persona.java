
package Ejercicios_Clases_02072019_POO_01;

public class persona {

    public static void main(String[] args) {
     saludo dani = new saludo();
        dani.nombre = "dani";
        dani.edad = 32;
        dani.sexo = 'M';
        dani.dni = 95236857;
        
        dani.mostrar();
        dani.comer();
        
        
    }

}