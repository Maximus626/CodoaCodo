
package Ejercicio_Clases_01102019_Layout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TablaSimple2 extends JFrame{

     public TablaSimple2() {
         super("Tabla Prueba 2");
         setSize(300,200);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         String titulos[] = {"Nombre", "Apellidos","Dni","Profeson"};
         String Matriz[][] 
                 = {
            {"Pepe","Diaz","7363635","Albañil"},
            {"Daniel","Perez","8373730","Stripper"}
            
        };
        
        JTable jt = new JTable(Matriz,titulos);
        JScrollPane js = new JScrollPane(jt);
        getContentPane().add(js,BorderLayout.CENTER);
    }
    
    
    public static void main(String[] args) {
        
        TablaSimple2 ts = new TablaSimple2();
        ts.setVisible(true);
    }

   
}