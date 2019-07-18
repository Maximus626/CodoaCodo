
package Ejercicio_Clases_11072019_3;

public class Operaciones {
    
    private int numero1;
    private int numero2;

    public Operaciones() {//CONTRUYE OBJETOS

    }

    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;

    }
    public int suma(){
    int resultado;
    resultado= numero1+numero2;
        return resultado;
    } 
    public int resta(){
    int resultado;
    resultado= numero1-numero2;
        return resultado;
    } 
    public int multi(){
    int resultado;
    resultado= numero1*numero2;
        return resultado;
    } 

}

    
  
