
package proyecto_medico;

import java.util.ArrayList;
import java.util.List;

public class Medico {

 private int id;
    private String apellido;
    private String nombre;
    
    private Especialidad especialidad;
    
    private List<Turno> listaTurnos = new ArrayList<>(); //LISTA DE TURNOS

    public Medico(int id, String apellido, String nombre, Especialidad especialidad) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    @Override
    public String toString() { //Obtenemos el nombre de la especialidad con getNombre()
        return "Medico{" + "idMedico=" + id + ", apellido=" + apellido + ", nombre=" + nombre + ", especialidad=" + especialidad.getNombre() + ", listaTurnos=" + listaTurnos + '}';
    }
    

}
