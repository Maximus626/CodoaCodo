package proyecto_medico;

import java.util.Date;

public class Turno {

    private int id;
    private int numero;

    //NO TENEMOS LISTAS EN ESTA CLASE PORQUE EN UML NO LO HAY
    private Paciente paciente;
    private Medico medico;
    private Date fecha;

    public Turno(int id, int numero, Paciente paciente, Medico medico, Date fecha) {
        this.id = id;
        this.numero = numero;
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Turno{" + "idTurno=" + id + ", numero=" + numero + ", paciente=" + paciente.getNombre() + ", medico=" + medico.getApellido() + ", fecha=" + fecha + '}';
    }

}
