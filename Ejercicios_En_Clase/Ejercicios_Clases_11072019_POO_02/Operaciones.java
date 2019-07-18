package Ejercicios_Clases_11072019_POO_02;

public class Operaciones {
    private int num1;
    private int num2;

    public Operaciones() {
    }

    public void setnum1(int num1) {
        this.num1 = num1;
    }

    public int getnum1() {
        return num1;
    }

    public void setnum2(int num2) {
        this.num2 = num2;
    }

    public int getnum2(){
    return num2;
    }
    
    public int suma() {
        int resul;
        resul = num1 + num2;
        return resul;
    }

    public int resta() {
        int resul;
        resul = num1 - num2;
        return resul;
    }

    public int multi() {
        int resul;
        resul = num1 * num2;
        return resul;
    }

}
