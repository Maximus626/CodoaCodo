package Ejercicio_Clases_11072019_1;

public class PersonaConst {

    private String nombre;
    private int edad;

    public PersonaConst() {//CONTRUYE OBJETOS

    }

    public PersonaConst(String nom, int ed) {
        this.nombre = nom;
        this.edad = ed;

    }

    //public PersonaConst(String nombre) {
    //    this.nombre = nombre;

    //}
    public void mostrar(){
            System.out.println("Nombre "+nombre+" edad: "+edad);
            }
    
}
