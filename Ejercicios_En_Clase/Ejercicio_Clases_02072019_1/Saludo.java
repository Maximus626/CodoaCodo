
package Ejercicio_Clases_02072019_1;

public class Saludo {

    public static void main(String[] args) {
       persona dani = new persona();
       dani.nombre="dani";
       dani.edad = 32;
       dani.sexo = 'M';
       dani.dni = 8748897;
             
       dani.saludo();
       dani.comer();
       dani.mostrar();
       
       persona roberto = new persona();
       roberto.nombre = "roberto";
       roberto.edad = 45;
       roberto.sexo ='M';
       roberto.dni = 6983675;
       
       roberto.mostrar();
       
    }
    
}
