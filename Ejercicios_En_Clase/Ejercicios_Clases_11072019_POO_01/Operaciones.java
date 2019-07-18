
package Ejercicios_Clases_11072019_POO_01;


public class Operaciones {
    
    public int num1;
    public int num2;
   
    public Operaciones(int num1, int num2){ //constructor
    
        this.num1 = num1;
        this.num2 = num2;
           
    }
    
    public int suma(){
    int resul;
    resul = num1 + num2;
    return resul;
    }
    
    public int resta(){
    int resul;
    resul = num1 - num2;
    return resul;
    }
    
    public int multi(){
    int resul;
    resul = num1 * num2;
    return resul;
    }
    
}
