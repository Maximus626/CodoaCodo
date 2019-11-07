
package BD_POO;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TestMain {

   
    public static void main(String[] args) {
       Conexion con = new Conexion();
       
        try {
            con.obtener();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestMain.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
