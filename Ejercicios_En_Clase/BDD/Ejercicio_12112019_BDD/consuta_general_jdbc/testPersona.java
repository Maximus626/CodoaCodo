package consuta_general_jdbc;

import interfaces.DAOpersona;
import patron_DAO.DAOpersonaimpl;

public class testPersona {
    
    public static void main(String[] args) {
//*****REGISTRAR*****
//        Persona per = new Persona();
//        per.setId(2);
//        per.setNombre("pablo");
//        per.setApellido("argento");
//        
//        DAOpersona dao = new DAOpersonaimpl();
//        dao.registrar(per);

//*****LISTAR O MOTRAR*****
         DAOpersona dao = new DAOpersonaimpl();
        for (Persona dao1 : dao.listar()){
            System.out.println(""+dao1.getId()+" "+dao1.getNombre()+" "+dao1.getApellido());
        }
//*****MODIFICAR*****
//        Persona per = new Persona();
//        per.setId(2);
//        per.setNombre("francisco");
//        per.setApellido("sosa");
//        DAOpersona dao = new DAOpersonaimpl();
//        dao.modificar(per);
     
//*****ELIMINAR***** 
//Persona per = new Persona();
//per.setId(2);
//DAOpersona dao = new DAOpersonaimpl();
//dao.eliminar(per);
//


    }
    
}
