
package Ejercicio_Clases_01102019_Layout;
import java.awt.*;
import javax.swing.*;

public class GridPractica {
    
    private JFrame ventana;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6;
    
    //En el constructor se inicializan los componentes;
    GridPractica(){
        ventana = new JFrame("FlowPractica");
        btn1 = new JButton("Boton 1");
        btn2 = new JButton("Boton 2");
        btn3 = new JButton("Boton 3");
        btn4 = new JButton("Boton 4");
        btn5 = new JButton("Boton 5");
        btn6 = new JButton("Boton 6");
    }
    
    //Agrega y muestra la ventana y sus componentes
    public void marco(){
        
        //Funciona con filas (2) y columnas(2)
        ventana.setLayout(new GridLayout(3, 0));
        
        ventana.add(btn1);
        ventana.add(btn2);
        ventana.add(btn3);
        ventana.add(btn4);
        ventana.add(btn5);
        ventana.add(btn6);
        
        ventana.setSize(500, 200);
        ventana.setVisible(true);
        
    }
    public static void main(String[] args) {
        GridPractica grid = new GridPractica();
        
        grid.marco();
    }
    
}