package proyecto_medico;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestMedico {

    public static void main(String[] args) {
        // TODO code application logic here
        //LAS CLASES VAN DE ABAJO HACIA ARRIBA: 1Âº ESPECIALIDAD -> MEDICO ; 2Âº PACIENTE -> TURNO
        //3Âº MEDICO -> TURNOS LO CUAL LLEVA A ESPECIALIDAD Y PACIENTE IR A (MEDICO Y TURNOS)
        //TENIENDO QUE EN "TURNOS" SE JUNTAN (MEDICO Y PACIENTE)
        //creamos las especialidades y las agregamos a la lista de especialidades
        Especialidad especialidad1 = new Especialidad(1, "DERMATOLOGO");
        Especialidad especialidad2 = new Especialidad(1, "GENERALISTA");

        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
        List<Especialidad> listaEsp = new ArrayList<>();
        listaEsp.add(especialidad1);
        listaEsp.add(especialidad2);

        //CREANDO UN MEDICO ASOCIADO CON SU RESPECTIVA ESPECIALIDAD
        Medico medico1 = new Medico(1, "FLORES", "JOSE", especialidad2);
        especialidad2.agregarUnMedico(medico1);//asocio el medico1 a la especialidad2 "GENERALISTA"

        //CREANDO UN MEDICO ASOCIADO CON SU RESPECTIVA ESPECIALIDAD
        Medico medico2 = new Medico(2, "GARCIA", "DAVID", especialidad1);
        especialidad1.agregarUnMedico(medico2);//asocio el medico2 a la especialidad1 "DERMATOLOGO"
        //BIDIRECCIONALIDAD ENTRE MEDICO Y ESPECIALIDAD COMO ESTA ABAJO
        especialidad1.mostrarListaMedicos(); //MUESTRA LA LISTA DE MEDICOS

        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
        List<Medico> listaMedicos = new ArrayList<>();
        listaMedicos.add(medico1); //AGREGAMOS UN MEDICO A LA LISTA DE MEDICO
        listaMedicos.add(medico2);

        //CREANDO PACIENTES CON SUS IDENTIDADES 
        Paciente paciente1 = new Paciente(1, "GOMEZ", "DANIEL", "15896655");
        Paciente paciente2 = new Paciente(2, "GAMBOA", "ALBERTO", "15645897");
        Paciente paciente3 = new Paciente(3, "ARGENTO", "PEPE", "15896674");

        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
        List<Paciente> listaPaciente = new ArrayList<>();
        listaPaciente.add(paciente1); //AGREGAMOS UN PACIENTE A LA LISTA DE PACIENTE
        listaPaciente.add(paciente2);
        listaPaciente.add(paciente3);

        //FECHA Y CREACION DE TURNOS
        Date fechaTurno = new Date(118, 4, 18); //a 118 se le suma 1900, El 0=enero, 4=mayo
        Turno turno1 = new Turno(1, 1, paciente2, medico1, fechaTurno);
        Turno turno2 = new Turno(2, 2, paciente1, medico1, fechaTurno);
        Turno turno3 = new Turno(3, 1, paciente3, medico2, fechaTurno);//turno 3 asociado a medico2

        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
        List<Turno> listaTurno = new ArrayList<>();
        listaTurno.add(turno1);
        listaTurno.add(turno2);
        listaTurno.add(turno3);

        //BUSQUEDA SECUENCIAL DE LA ESPECIALIDAD DEL MEDICO POR SU ID
        for (Medico medico : listaMedicos) { //MUESTRA LOS MEDICOS DE LA ESPECIALIDAD 1
            if (medico.getEspecialidad().getId() == especialidad1.getId()) { //DERMATOLOGO
                // System.out.println(medico.toString()); //mostramos datos de ese medico
            }
        }

        //BUSQUEDA SECUENCIAL DEL MEDICO DE ESE TURNO POR SU ID Y COMPARA CON ID MEDICO2
        for (Turno turno : listaTurno) { //MUESTRA LOS TURNOS DEL MEDICO
            if (turno.getMedico().getId() == medico2.getId()) {//EL MEDICO2 TIENE LA ESPECIALIDAD1
                System.out.println(turno.toString()); //mostramos datos de ese turno
            }
        }

    }

}
