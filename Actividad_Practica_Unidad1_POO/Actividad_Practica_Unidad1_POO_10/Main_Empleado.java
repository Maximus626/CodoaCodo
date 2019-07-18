package Ejercicios_unidad1_POO_10;

public class Main_Empleado {

    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Daniel", "Martinez", "401256", 34, false, 3000);

        emp1.mostrarClasificacion();
        emp1.mostrar();
        System.out.println("Aumento de saldo del 10%: " + emp1.aumentoSalario(10));

        System.out.println("");

        Empleado emp2 = new Empleado("Emanuel", "Gomez", "359639", 22, true, 4569);

        emp2.mostrarClasificacion();
        emp2.mostrar();
        System.out.println("Aumento de saldo del 20%: " + emp2.aumentoSalario(20));
    }
}
