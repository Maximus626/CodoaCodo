
package LOGICA;



import DATOS.vcliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fcliente {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL1 = "";
    private Integer totalRegistro;
    
    public boolean insertar(vcliente dts){
        
        sSQL="insert into persona(nombre,apaterno,amaterno,tipo_documento,num_documento,direccion,telefono,email) "
                + "values(?,?,?,?,?,?,?,?);";
        sSQL1="insert into cliente(idpersona,codigo_cliente) "
                + "values((select idpersona from persona order by idpersona desc limit 1),?);";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL); //persona
            PreparedStatement pst2 = cn.prepareStatement(sSQL1); //cliente  
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApaterno());
            pst.setString(3, dts.getAmaterno());
            pst.setString(4, dts.getTipo_documento());
            pst.setString(5, dts.getNum_documento());
            pst.setString(6, dts.getDireccion());
            pst.setString(7, dts.getTelefono());
            pst.setString(8, dts.getEmail());
        
            pst2.setString(1, dts.getCodigo_cliente());
            
            int n = pst.executeUpdate();
            
            if (n !=0) {
                int n2 = pst2.executeUpdate();
                if (n2 !=0) {
                    return true;
                }
            }else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(fcliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
//        sSQL = "INSERT INTO persona(nombre, apaterno, amaterno, tipo_documento, " 
//                + "num_documento, direccion, telefono, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
//        
//        sSQL1 = "INSERT INTO cliente(idpersona, codigo_cliente) VALUES ((SELECT idpersona FROM persona ORDER BY idpersona desc LIMIT 1), ?);";
//        
//        System.out.println(sSQL);
//        System.out.println(sSQL1);
//        try {
//            
//            PreparedStatement pst = cn.prepareStatement(sSQL);
//            PreparedStatement pst1 = cn.prepareStatement(sSQL1);
//            
//            pst.setString(1, dts.getNombre());
//            pst.setString(2, dts.getApaterno());
//            pst.setString(3, dts.getAmaterno());
//            pst.setString(4, dts.getTipo_documento());
//            pst.setString(5, dts.getNum_documento());
//            pst.setString(6, dts.getDireccion());
//            pst.setString(7, dts.getTelefono());
//            pst.setString(8, dts.getEmail());
//            
//            pst1.setString(1, dts.getCodigo_cliente());
//            
//            int n = pst.executeUpdate();
//            
//            if(n != 0){
//                int n2 = pst1.executeUpdate();
//                if(n2 != 0){
//                    return true;
//                }else{
//                    return false;
//                }
//            }else{
//                return false;
//            }
//            
//            
//        } catch (SQLException ex) {
//            //Logger.getLogger(FCliente.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
//        }
//        
//        return false;
    }
    
    
    //MOSTRAR
    public DefaultTableModel mostrar(){
    
    DefaultTableModel modelo;
    String titulos[]={"id","Nombre","Apaterno","Amaterno","Doc","NumDoc","Direccion","Telefono","Email","Codigo"};
    String registro[] = new String[10];
    
    modelo = new DefaultTableModel(null,titulos);
    
    sSQL = "select p.idpersona, p.nombre, p.apaterno, p.amaterno, p.tipo_documento, p.num_documento,"
            +"p.direccion, p.telefono, p.email, c.codigo_cliente from persona as p inner join cliente as c "
            +"on p.idpersona=c.idpersona";
    
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while (rs.next()){
            registro[0] = rs.getString("idpersona");
            registro[1] = rs.getString("nombre");
            registro[2] = rs.getString("apaterno");
            registro[3] = rs.getString("amaterno");
            registro[4] = rs.getString("tipo_documento");
            registro[5] = rs.getString("num_documento");
            registro[6] = rs.getString("direccion");
            registro[7] = rs.getString("telefono");
            registro[8] = rs.getString("email");
            registro[9] = rs.getString("codigo_cliente");
            
            modelo.addRow(registro);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(fcliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return modelo;
    
}
    
    
}