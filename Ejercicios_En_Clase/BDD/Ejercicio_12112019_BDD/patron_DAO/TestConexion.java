
package patron_DAO;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestConexion {
 public static void main(String[] args) {
        Conexion con = new Conexion();
        try {
            con.coneccion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex); 
        }  
    }
    
}
