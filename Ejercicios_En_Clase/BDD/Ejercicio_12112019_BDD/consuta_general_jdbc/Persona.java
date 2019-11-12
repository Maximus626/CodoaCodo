
package consuta_general_jdbc;

public class Persona {
    
    public int id;
    public String nombre;
    public String Apellido;
    
     public Persona() {
    }
   

    public int getId() {
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

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Persona(int id, String nombre, String Apellido) {
        this.id = id;
        this.nombre = nombre;
        this.Apellido = Apellido;
    }

   
    
}
