
package Ejercicio_Clases_02072019_3;

public class vehiculos {

  public static void main(String[] args) {
        
        vehiculo ferrari = new vehiculo();
        
        ferrari.color = "Rojo";
        ferrari.marca = "Ferrari";
        ferrari.matricula = "8527 LJV";
        ferrari.modelo = "F40";
        ferrari.potencia = 478;
        ferrari.precio = 400000;
        
        ferrari.mostrar();
        
        System.out.println("");
        
        vehiculo toyota = new vehiculo();
        
        toyota.color = "Negro";
        toyota.marca = "Toyota";
        toyota.matricula = "1738 HJD";
        toyota.modelo = "Corolla 1.8 XL";
        toyota.potencia = 140;
        toyota.precio = 19663;
        
        toyota.mostrar();
        
        System.out.println("");
        
        vehiculo nissan = new vehiculo();
        
        nissan.color = "Negro";
        nissan.marca = "Nissan";
        nissan.matricula = "4952 BPE";
        nissan.modelo = "Versa";
        nissan.potencia = 106;
        nissan.precio = 13090;
        
        nissan.mostrar();
        
    }
}