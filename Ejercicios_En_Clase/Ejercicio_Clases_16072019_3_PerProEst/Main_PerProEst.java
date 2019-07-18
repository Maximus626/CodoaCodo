
package Ejercicio_Clases_16072019_3_PerProEst;

public class Main_PerProEst {

    public static void main(String[] args) {
       Estudiante estu1 = new Estudiante(123, "pepe", "pepon", 32, "Argentino");
       Profesor profe1 = new Profesor(2, "alberto", "huipa", 44, "Colombiano");
       
        System.out.println(estu1.toString());
        System.out.println(profe1.toString());
    }
    
}
