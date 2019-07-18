package ejercicios_unidad1_POO_09;

public class CuentaBancaria {

    public int saldo;

    public CuentaBancaria() {
        this.saldo = 1000;
    }

    public void depositar(int ingreso) {
        System.out.println("Saldo Actual: $" + saldo);
        this.saldo += ingreso;

        System.out.println("");
        System.out.println("Ud deposito: $" + ingreso);
        System.out.println("Saldo Actual: $" + saldo);

    }

    public void extraer(int extraccion) {
        this.saldo -= extraccion;
        System.out.println("");
        System.out.println("Ud retiro: $" + extraccion);
        System.out.println("Saldo Actual: $" + saldo);
    }
}
