
package Ejercicios_Clases_06062019;

public class NewMain {

   
     public static void main(String[] args) {
       char caracter ='a';
       
        System.out.println("El caracter '"+caracter+"' tiene el codigo"+devuelveCodigoASCII(caracter));

    }

    public static int devuelveCodigoASCII(char caracter){
        return (int) caracter;
        
        
    }
    
}