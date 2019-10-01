package Ejercicio_Clases_01102019_Layout;

import javax.swing.*;

public class BoxPractica {

    private JFrame ventana;
    private JButton btn1, btn2, btn3, btn4, btn5;

    BoxPractica() {
        ventana = new JFrame("Box Layout");

        btn1 = new JButton("Boton 1");
        btn2 = new JButton("Boton 2");
        btn3 = new JButton("Boton 3");
        btn4 = new JButton("Boton 4");
        btn5 = new JButton("Boton 5");
    }

    public void marco() {

        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.X_AXIS));

        ventana.add(btn1);
        ventana.add(btn2);
        ventana.add(btn3);
        ventana.add(btn4);
        ventana.add(btn5);

        ventana.setSize(500, 200);

        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        BoxPractica box = new BoxPractica();

        box.marco();
    }
}
