
import javax.swing.*;
import java.awt.event.*;

public class JField_Jarea extends JFrame implements ActionListener {

    private JTextField textfield1;
    private JTextArea area;
    private JScrollPane scroll;
    private JButton boton1;
    String texto;

    public JField_Jarea() {
        setLayout(null);
        textfield1 = new JTextField();
        textfield1.setBounds(10, 10, 200, 30);
        add(textfield1);

        boton1 = new JButton("Agregar");
        boton1.setBounds(250, 10, 100, 30);
        boton1.addActionListener(this);
        add(boton1);

        area = new JTextArea();
        scroll = new JScrollPane(area);
        scroll.setBounds(10,50,400,300);
        add(scroll);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton1){
            texto += textfield1.getText() + "\n";
            area.setText(texto);
            textfield1.setText("");
        }
    }
    public static void main(String []args){
        JField_Jarea JField_Jarea1 = new JField_Jarea();
        JField_Jarea1.setBounds(0,0,440,400);
        JField_Jarea1.setVisible(true);
        JField_Jarea1.setResizable(false);
        JField_Jarea1.setLocationRelativeTo(null);
    }
}