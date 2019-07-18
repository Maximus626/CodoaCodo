
package Ejercicio_Clases_16072019_4_PerAlumPro;
public class Test_Main {
    public static void main(String[] args) {
        Profesor prof = new Profesor();
        
        System.out.println("Profesor");
        prof.setNombre("Martin");
        prof.setApellido("Martinez");
        prof.setEdad(23);
        prof.setNacionalidad("Argentino");
        prof.setLegajo(53);
        prof.setCursos(3);
        
        System.out.println(prof.toString());
        
        System.out.println("");
        
        Alumno alum = new Alumno();
        
        System.out.println("Alumno");
        alum.setNombre("Eduardo");
        alum.setApellido("Villalba");
        alum.setEdad(20);
        alum.setNacionalidad("Venezolano");
        alum.setLegajo(46);
        
        System.out.println(alum.toString());
    }
}