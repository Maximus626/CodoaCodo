
package Ejercicio_Clases_01102019_Layout;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TablaSimple extends JFrame{

     public TablaSimple() {
         super("Tabla Prueba");
         setSize(300,200);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         String titulos[] = {"Nombre", "Apellidos"};
         String Matriz[][] 
                 = {
            {"Pepe","Diaz"},
            {"Daniel","Perez"}
            
        };
        
        JTable jt = new JTable(Matriz,titulos);
        JScrollPane js = new JScrollPane(jt);
        getContentPane().add(js,BorderLayout.CENTER);
    }
    
    
    public static void main(String[] args) {
        
        TablaSimple ts = new TablaSimple();
        ts.setVisible(true);
    }

   
}
