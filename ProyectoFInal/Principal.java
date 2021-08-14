package ProyectoFInal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {

    private JMenuBar mb;
    private JMenu opciones, acerca, fondo, calcular;
    private JMenuItem oscuro, rojo, salir, creditos, vacaciones, restablecer;
    private JLabel logo, bienvenido, datos, nombre, apellido1;
    private JLabel apellido2, departamento, antiguedad, resultado, derechos;
    private JTextArea calculo;
    private JScrollPane scroll;
    private JTextField nombretext, apellidotext1, apellidotext2;
    private JComboBox departamentobox, antiguedadbox;
    String ventana = "";

    public Principal() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");
        getContentPane().setBackground(new Color(255, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        Bienvenida ventana1 = new Bienvenida();
        ventana = ventana1.texto;

        mb = new JMenuBar();
        setJMenuBar(mb);

        opciones = new JMenu("Opciones");
        opciones.setFont(new Font("Andale Mono", 1, 14));
        opciones.setBackground(new Color(255, 0, 0));
        mb.add(opciones);

        calcular = new JMenu("Calcular");
        calcular.setFont(new Font("Andale Mono", 1, 14));
        mb.add(calcular);

        acerca = new JMenu("Acerca");
        acerca.setFont(new Font("Andale Mono", 1, 14));
        mb.add(acerca);

        fondo = new JMenu("Color de fondo");
        fondo.setFont(new Font("Andale Mono", 1, 14));
        opciones.add(fondo);

        vacaciones = new JMenuItem("Vacaciones");
        vacaciones.setFont(new Font("Andale Mono", 1, 14));
        vacaciones.addActionListener(this);
        calcular.add(vacaciones);

        rojo = new JMenuItem("Rojo(Predeterminado)");
        rojo.setFont(new Font("Andale Mono", 1, 14));
        rojo.addActionListener(this);
        fondo.add(rojo);

        oscuro = new JMenuItem("Modo oscuro");
        oscuro.setFont(new Font("Andale Mono", 1, 14));
        oscuro.addActionListener(this);
        fondo.add(oscuro);

        restablecer = new JMenuItem("Restablecer variables");
        restablecer.setFont(new Font("Andale Mono", 1, 14));
        restablecer.addActionListener(this);
        opciones.add(restablecer);

        salir = new JMenuItem("Salir");
        salir.setFont(new Font("Andale Mono", 1, 14));
        salir.addActionListener(this);
        opciones.add(salir);

        creditos = new JMenuItem("Creditos");
        creditos.setFont(new Font("Andale Mono", 1, 14));
        creditos.addActionListener(this);
        acerca.add(creditos);

        ///////////////////////////////////////

        ImageIcon imagen = new ImageIcon(getClass().getResource("images/logo-coca.png"));
        logo = new JLabel(imagen);
        logo.setBounds(5, 5, 250, 100);
        add(logo);

        bienvenido = new JLabel("Bienvenido " + ventana);
        bienvenido.setBounds(280, 30, 300, 50);
        bienvenido.setFont(new Font("Andale Mono", 1, 32));
        bienvenido.setForeground(new Color(255, 255, 255));
        add(bienvenido);

        datos = new JLabel("Datos del trabajador para el calculo de vacaciones");
        datos.setBounds(45, 140, 900, 25);
        datos.setFont(new Font("Andale Mono", 1, 24));
        datos.setForeground(new Color(255, 255, 255));
        add(datos);

        nombre = new JLabel("Nombre Completo: ");
        nombre.setBounds(25, 188, 180, 25);
        nombre.setFont(new Font("Andale Mono", 1, 12));
        nombre.setForeground(new Color(255, 255, 255));
        add(nombre);

        nombretext = new JTextField();
        nombretext.setBounds(25, 213, 150, 25);
        nombretext.setBackground(new java.awt.Color(244, 244, 244));
        nombretext.setFont(new Font("Andale Mono", 1, 12));
        nombretext.setForeground(new Color(255, 0, 0));
        add(nombretext);

        apellido1 = new JLabel("Apellido Parterno");
        apellido1.setBounds(25, 248, 180, 25);
        apellido1.setFont(new Font("Andale Mono", 1, 12));
        apellido1.setForeground(new Color(255, 255, 255));
        add(apellido1);

        apellidotext1 = new JTextField();
        apellidotext1.setBounds(25, 273, 150, 25);
        apellidotext1.setBackground(new java.awt.Color(244, 244, 244));
        apellidotext1.setFont(new Font("Andale Mono", 1, 14));
        apellidotext1.setForeground(new Color(255, 0, 0));
        add(apellidotext1);

        apellido2 = new JLabel("Apellido Parterno");
        apellido2.setBounds(25, 308, 180, 25);
        apellido2.setFont(new Font("Andale Mono", 1, 12));
        apellido2.setForeground(new Color(255, 255, 255));
        add(apellido2);

        apellidotext2 = new JTextField();
        apellidotext2.setBounds(25, 334, 150, 25);
        apellidotext2.setBackground(new java.awt.Color(244, 244, 244));
        apellidotext2.setFont(new Font("Andale Mono", 1, 14));
        apellidotext2.setForeground(new Color(255, 0, 0));
        add(apellidotext2);

        departamento = new JLabel("Seleeciona el Departamento");
        departamento.setBounds(220, 188, 180, 25);
        departamento.setFont(new Font("Andale Mono", 1, 12));
        departamento.setForeground(new Color(255, 255, 255));
        add(departamento);

        departamentobox = new JComboBox();
        departamentobox.setBounds(220, 213, 220, 25);
        departamentobox.setBackground(new Color(224, 224, 224));
        departamentobox.setFont(new Font("Andale Mono", 1, 14));
        departamentobox.setForeground(new Color(255, 0, 0));
        add(departamentobox);
        departamentobox.addItem("");
        departamentobox.addItem("Atencion al Cliente");
        departamentobox.addItem("Departamento de Logistica");
        departamentobox.addItem("Departamento de Gerencia");

        antiguedad = new JLabel("Selecciona la Antiguedad");
        antiguedad.setBounds(220, 248, 180, 25);
        antiguedad.setFont(new Font("Andale Mono", 1, 12));
        antiguedad.setForeground(new Color(255, 255, 255));
        add(antiguedad);

        antiguedadbox = new JComboBox();
        antiguedadbox.setBounds(220, 273, 220, 25);
        antiguedadbox.setBackground(new Color(224, 224, 224));
        antiguedadbox.setFont(new Font("Andale Mono", 1, 14));
        antiguedadbox.setForeground(new Color(255, 0, 0));
        add(antiguedadbox);
        antiguedadbox.addItem("");
        antiguedadbox.addItem("1 año de servicio");
        antiguedadbox.addItem("2 a 6 años de servicio");
        antiguedadbox.addItem("7 años de servicio");

        resultado = new JLabel("Resultado del Calculo");
        resultado.setBounds(220, 248, 180, 25);
        resultado.setFont(new Font("Andale Mono", 1, 12));
        resultado.setForeground(new Color(255, 255, 255));
        add(resultado);

        calculo = new JTextArea();
        calculo.setEditable(false);
        calculo.setBackground(new Color(244, 244, 244));
        calculo.setFont(new Font("Andale Mono", 1, 11));
        calculo.setForeground(new Color(255, 0, 0));
        calculo.setText("\n Aqui aparece el resulrado del calculo de las vacaciones");
        scroll = new JScrollPane(calculo);
        scroll.setBounds(220, 333, 385, 90);
        add(scroll);

        derechos = new JLabel("@2021 The Coca-Cola Company | Todos los derechos estan reservados");
        derechos.setBounds(135, 445, 500, 30);
        derechos.setFont(new Font("Andale Mono", 3, 12));
        derechos.setForeground(new Color(255, 255, 255));
        add(derechos);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vacaciones) {

            String nombretrabajador = nombretext.getText();
            String ap = apellidotext1.getText();
            String ap2 = apellidotext2.getText();
            String dep = departamentobox.getSelectedItem().toString();
            String ant = antiguedadbox.getSelectedItem().toString();

            if (nombretrabajador.equals("") || ap.equals("") || ap2.equals("") ||
                    dep.equals("") || ant.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
            }
            else {

                if (dep.equals("Atencion al Cliente")) {

                    if (ant.equals("1 año de servicio")) {
                        calculo.setText("\n   El trabajador " + nombretrabajador + " " + ap + " " + ap2 +
                                "\n   quien labora en " + dep + " con " + ant +
                                "\n   recibe 6 dias de vacaciones.");
                    }
                    if (ant.equals("2 a 6 años de servicio")) {
                        calculo.setText("\n   El trabajador " + nombretrabajador + " " + ap + " " + ap2 +
                                "\n   quien labora en " + dep + " con " + ant +
                                "\n   recibe 14 dias de vacaciones.");
                    }
                    if (ant.equals("7 años de servicio")) {
                        calculo.setText("\n   El trabajador " + nombretrabajador + " " + ap + " " + ap2 +
                                "\n   quien labora en " + dep + " con " + ant +
                                "\n   recibe 20 dias de vacaciones.");
                    }
                }

                //////////////////////

                if (dep.equals("Departamento de Logistica")) {

                    if (ant.equals("1 año de servicio")) {
                        calculo.setText("\n   El trabajador " + nombretrabajador + " " + ap + " " + ap2 +
                                "\n   quien labora en " + dep + " con " + ant +
                                "\n   recibe 7 dias de vacaciones.");
                    }
                    if (ant.equals("2 a 6 años de servicio")) {
                        calculo.setText("\n   El trabajador " + nombretrabajador + " " + ap + " " + ap2 +
                                "\n   quien labora en " + dep + " con " + ant +
                                "\n   recibe 15 dias de vacaciones.");
                    }
                    if (ant.equals("7 años de servicio")) {
                        calculo.setText("\n   El trabajador " + nombretrabajador + " " + ap + " " + ap2 +
                                "\n   quien labora en " + dep + " con " + ant +
                                "\n   recibe 22 dias de vacaciones.");
                    }

                }

                ////////////////////////////

                if (dep.equals("Departamento de Gerencia")) {

                    if (ant.equals("1 año de servicio")) {
                        calculo.setText("\n   El trabajador " + nombretrabajador + " " + ap + " " + ap2 +
                                "\n   quien labora en " + dep + " con " + ant +
                                "\n   recibe 10 dias de vacaciones.");
                    }
                    if (ant.equals("2 a 6 años de servicio")) {
                        calculo.setText("\n   El trabajador " + nombretrabajador + " " + ap + " " + ap2 +
                                "\n   quien labora en " + dep + " con " + ant +
                                "\n   recibe 20 dias de vacaciones.");
                    }
                    if (ant.equals("7 años de servicio")) {
                        calculo.setText("\n   El trabajador " + nombretrabajador + " " + ap + " " + ap2 +
                                "\n   quien labora en " + dep + " con " + ant +
                                "\n   recibe 30 dias de vacaciones.");
                    }
                }
            }
        }

        ///////////////////////////////////////////////

        if (e.getSource() == rojo) {
            getContentPane().setBackground(new Color(255, 0, 0));
        }

        if (e.getSource() == oscuro) {
            getContentPane().setBackground(new Color(26, 21, 21));
        }

        if (e.getSource() == restablecer) {
            nombretext.setText("");
            apellidotext1.setText("");
            apellidotext2.setText("");
            departamentobox.setSelectedIndex(0);
            antiguedadbox.setSelectedIndex(0);
            calculo.setText("\n Aqui aparece el resulrado del calculo de las vacaciones");
        }

        if (e.getSource() == creditos) {
            JOptionPane.showMessageDialog(null,"Yo");
        }

        if (e.getSource() == salir) {
            Bienvenida bien1 = new Bienvenida();
            bien1.setBounds(0, 0, 360, 450);
            bien1.setVisible(true);
            bien1.setResizable(false);
            bien1.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

        public static void main (String[]args){
            Principal Principal1 = new Principal();
            Principal1.setBounds(0, 0, 640, 540);
            Principal1.setVisible(true);
            Principal1.setResizable(false);
            Principal1.setLocationRelativeTo(null);
    }
}