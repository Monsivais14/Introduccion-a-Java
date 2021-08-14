package ProyectoFInal;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener{

    private JTextField textfield;
    private JLabel label1,label2,label3,label4;
    private JButton boton1;
    public static String texto = "";
    public Bienvenida(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));                                         //
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());        // agregar un icono a el programa
        ImageIcon imagen = new ImageIcon(getClass().getResource("images/logo-coca.png"));        // agregar una imagen en un JLabel
        label1 = new JLabel(imagen);                                                              //
        label1.setBounds(25,15,300,150);
        add(label1);
        label2 = new JLabel("Sistema de Control Vacacional");
        label2.setBounds(35,135,300,30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(new Color(255, 255, 255));
        add(label2);

        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45,212,200,30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);

        label4 = new JLabel("@2021 The Coca-Cola Company");
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(255, 255, 255));
        add(label4);

        textfield = new JTextField();
        textfield.setBounds(45,240,255,25);                          //
        textfield.setBackground(new Color(186, 186, 186));           //color de fondo
        textfield.setFont(new Font("Andale Mono", 1, 14));           //tipografia, tipo y numero de tamaño de letra
        textfield.setForeground(new Color(255, 0, 0));               //color de la letra
        add(textfield);                                              //

        boton1 = new JButton("Ingresar");
        boton1.setBounds(125,280,100,30);
        boton1.setBackground(new Color(255, 255, 255));
        boton1.setFont(new Font("Andale Mono",1,14));
        boton1.setForeground(new Color(255,0,0));
        boton1.addActionListener(this);
        add(boton1);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()== boton1){
            texto = textfield.getText().trim();      //trim borra espacios inservibles
            if(texto.equals("")){
                JOptionPane.showMessageDialog(null, "Debes Ingresar tu nombre");       //ventana emergente
            }
            else{
                Terminos ventanalicencia = new Terminos();
                ventanalicencia.setBounds(0,0,600,380);
                ventanalicencia.setVisible(true);
                ventanalicencia.setLocationRelativeTo(null);
                ventanalicencia.setResizable(false);
                this.setVisible(false);
            }
        }
    }

    public static void main(String []args){
        Bienvenida bien1 = new Bienvenida();
        bien1.setBounds(0,0,360,450);
        bien1.setVisible(true);
        bien1.setResizable(false);
        bien1.setLocationRelativeTo(null);
    }
}