package BD_POO;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    public Conexion() {
    }

    public Connection obtener() throws ClassNotFoundException {

        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/bd", "root", "");
            Statement st = (Statement) con.createStatement();
            System.out.println("Conexion Exitosa");

//Insertar datos
            //String sql = "Insert into usuario(nombre,apellido,edad,sexo) values('Toni','Montana','34','Masculino')";
            //String sql = "Insert into usuario(nombre,apellido,edad,sexo) values('alberto','Montana','34','Masculino')";
            //st.execute(sql);
            
//Seleccionar datos
//            String sql1 = "select * from usuario";
//            ResultSet rs = st.executeQuery(sql1);
//            while (rs.next()){
//                System.out.println("nombre: "+rs.getString("nombre"));
//                System.out.println("apellido: "+rs.getString("apellido"));
//                System.out.println("edad: "+rs.getString("edad"));
//                System.out.println("sexo: "+rs.getString("sexo"));
//                System.out.println("");
//                    }
            
//Borrar datos
            //String sql2 = "delete from usuario where nombre = 'alberto';";
            //st.execute(sql2);
            
            
//Actualizar datos            
            //String sql3 = "update usuario set edad='43' where nombre='Toni' and apellido='Montana';";
            //st.execute(sql3);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;

    }
}
