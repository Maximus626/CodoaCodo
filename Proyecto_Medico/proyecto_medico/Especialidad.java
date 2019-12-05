package proyecto_medico;

import java.util.ArrayList;
import java.util.List;

public class Especialidad {
private int id;
    private String nombre;
    
    private List<Medico> listaMedicos = new ArrayList<>();//LISTA DE MEDICOS

    public Especialidad(String nombre) {
        super();
        this.nombre = nombre;
    }

    public Especialidad(int id, String nombre) {
        super();
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() { //metodo que devuelve o obtiene el id
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Medico> getListaMedicos() {
        return listaMedicos;
    }

    public void setListaMedicos(List<Medico> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }
    //creamos un metodo para agregar los medicos asociados a la especialidad
    public void agregarUnMedico(Medico medico){
        listaMedicos.add(medico);
    }
    //metodo para recorrer y mostrar la lista de medicos de esta especialidad
    public void mostrarListaMedicos(){
        for (Medico medico : listaMedicos) {
            System.out.println(medico.toString());
        }
    }

}
