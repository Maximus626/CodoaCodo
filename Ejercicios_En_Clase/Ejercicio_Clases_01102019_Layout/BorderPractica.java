package Ejercicio_Clases_01102019_Layout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderPractica {

    private JFrame ventana;
    private JPanel lienzo;

    public BorderPractica() {
        ventana = new JFrame("Ejemplo BorderLayout");
        lienzo = new JPanel();
    }

    public void marco() {
        ventana.setLayout(new BorderLayout());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(lienzo);
        ventana.add(new JButton("Sur"), "South");
        ventana.add(new JButton("Norte"), "North");
        ventana.add(new JButton("Este"), "East");
        ventana.add(new JButton("Oeste"), "West");
        ventana.add(new JButton("Centro"), "Center");
        ventana.setSize(500, 200);
        ventana.setVisible(true);

    }

    public static void main(String[] args) {
        BorderPractica d = new BorderPractica();
        d.marco();
    }

}
