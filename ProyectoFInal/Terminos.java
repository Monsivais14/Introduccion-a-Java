package ProyectoFInal;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Terminos extends JFrame implements ActionListener,ChangeListener{

    private JTextArea textarea;
    private JScrollPane scroll;
    private JCheckBox check;
    private JButton boton1,boton2;
    private JLabel label1,label2;
    String nombre = "";

    public Terminos(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(227, 226, 226));
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        /////
        Bienvenida ventana = new Bienvenida();                                                // utilizar una variable de otra clase
        nombre = ventana.texto;                                                                /////

        label1 = new JLabel("Terminos y condiciones");
        label1.setBounds(215,5,200,30);
        label1.setFont(new Font("Andale Mono",1,14));
        label1.setForeground(new Color(0,0,0));
        add(label1);

        textarea = new JTextArea();
        textarea.setText("\n \n          TERMINOS Y CONDICIONES                    \n" +
                         "\n \n          No tengo idea de que escribir aqui          ");
        textarea.setEditable(false);
        textarea.setFont(new Font("Andale Mono",0,10));
        scroll = new JScrollPane(textarea);
        scroll.setBounds(10,40,565,200);
        add(scroll);

        check = new JCheckBox("Yo " + nombre +" acepto");
        check.setBounds(10,250,300,30);
        check.addChangeListener(this);
        check.setBackground(new Color(227,226,226));
        add(check);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10,290,100,30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2 = new JButton("No Acepto");
        boton2.setBounds(120,290,100,30);
        boton2.addActionListener(this);
        add(boton2);

        ImageIcon imagen = new ImageIcon(getClass().getResource("images/coca-cola.png"));
        label2 = new JLabel(imagen);
        label2.setBounds(305,135,300,300);
        add(label2);
    }
    public void stateChanged(ChangeEvent e){
        if(check.isSelected()== true){
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        }
        else{
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton1){
            Principal principal1 = new Principal();
            principal1.setBounds(0, 0, 640, 540);
            principal1.setVisible(true);
            principal1.setResizable(false);
            principal1.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if(e.getSource() == boton2){
            Bienvenida bien1 = new Bienvenida();
            bien1.setBounds(0,0,360,450);
            bien1.setVisible(true);
            bien1.setResizable(false);
            bien1.setLocationRelativeTo(null);
        }
    }
    public static void main(String []args){
        Terminos ventanalicencia = new Terminos();
        ventanalicencia.setBounds(0,0,600,380);
        ventanalicencia.setVisible(true);
        ventanalicencia.setLocationRelativeTo(null);
        ventanalicencia.setResizable(false);
    }
}