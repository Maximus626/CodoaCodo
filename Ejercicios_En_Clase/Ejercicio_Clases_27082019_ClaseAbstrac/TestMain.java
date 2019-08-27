package Ejercicio_Clases_27082019_ClaseAbstrac;

public class TestMain {

    public static void main(String[] args) {

        Alumno per = new Alumno(178, "Pepe", 23);
        Profesor pr = new Profesor("Programacion", "Matias", 25);
        System.out.println("Legajo Alumno: " + per.getLegajo() + " Nombre Alumno: " + per.getNombre() + " Edad Alumnno : " + per.getEdad());
        System.out.println("Materia profesor: " + pr.getMateria() + " Nombre Profesor :" + pr.getNombre() + " Edad Profesor: " + pr.getEdad());
    }

}
