
package Ejercicio_Clases_01102019_Layout;
import javax.swing.*;
import java.awt.*;
import static java.awt.FlowLayout.LEFT;

public class FlowPractica {
    
    private JFrame ventana;
    private JButton btn1, btn2, btn3, btn4, btn5;
    
    //En el constructor se inicializan los componentes;
    FlowPractica(){
        ventana = new JFrame("FlowPractica");
        btn1 = new JButton("Boton 1");
        btn2 = new JButton("Boton 2");
        btn3 = new JButton("Boton 3");
        btn4 = new JButton("Boton 4");
        btn5 = new JButton("Boton 5");
    }
    
    //Agrega y muestra la ventana y sus componentes
    public void marco(){
        //Es para que se ordenen de izquierda a derecha;
        //ventana.setLayout(new FlowLayout(FlowLayout.TRAILING));
        
        ventana.setLayout(new FlowLayout(LEFT, 10 ,30));
        
        ventana.add(btn1);
        ventana.add(btn2);
        ventana.add(btn3);
        ventana.add(btn4);
        ventana.add(btn5);
        
        //Si no entran todos en la ventana...
        // ...no se superponen sino que los manda para abajo
        ventana.setSize(500, 200);
        ventana.setVisible(true);
        
    }
    public static void main(String[] args) {
        FlowPractica flow = new FlowPractica();
        
        flow.marco();
    }
}