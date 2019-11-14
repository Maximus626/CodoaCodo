package patron_DAO;

import com.mysql.jdbc.Statement;
import consuta_general_jdbc.Persona;
import interfaces.DAOpersona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOpersonaimpl extends Conexion implements DAOpersona {

    public static Statement sentencia;
    public static ResultSet resultado;

    @Override
    public void registrar(Persona per) {

        try {
            this.coneccion();
            try {
                PreparedStatement st = this.coneccion().prepareStatement("Insert into personas(idpersona, nombre, apellido) values (?,?,?);");
                st.setInt(1, per.getId());
                st.setString(2, per.getNombre());
                st.setString(3, per.getApellido());
                st.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(DAOpersonaimpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOpersonaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modificar(Persona per) {
        try {
            this.coneccion();
            try {
                PreparedStatement st = this.coneccion().prepareStatement("Update personas set nombre=? , apellido=? where idpersona=?");

                st.setString(1, per.getNombre());
                st.setString(2, per.getApellido());
                st.setInt(3, per.getId());
                st.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(DAOpersonaimpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOpersonaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminar(Persona per) {

        try {
            this.coneccion();

            try {
                PreparedStatement st = this.coneccion().prepareStatement("delete from personas where idpersona=?");
                st.setInt(1, per.getId());
                st.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(DAOpersonaimpl.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOpersonaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Persona> listar() {

        List<Persona> lista = null;
        try {
            this.coneccion();
            try {
                PreparedStatement st = this.coneccion().prepareStatement("Select * from personas");
                lista = new ArrayList();
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    Persona cod = new Persona();
                    cod.setId(rs.getInt("idpersona"));
                    cod.setNombre(rs.getString("nombre"));
                    cod.setApellido(rs.getString("apellido"));
                    lista.add(cod);
                }

            } catch (SQLException ex) {
                Logger.getLogger(DAOpersonaimpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOpersonaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;

    }

}
