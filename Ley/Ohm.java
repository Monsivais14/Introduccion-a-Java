package Ley;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.Arc2D;

public class Ohm extends JFrame implements ActionListener, ItemListener {

    private JLabel imavoltaje,imacorriente,imaresistencia,imapotencia;
    private JLabel jvoltaje,jcorriente,jresistencia,jpotencia;
    private JTextField voltaje,corriente,resistencia,potencia;
    private JComboBox combovoltaje,combocorriente,comboresistencia,combopotencia;
    private JButton limpiar, calcular;
    private double numvoltaje,numcorriente,numresistencia,numpotencia;

   public Ohm(){
       setLayout(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setTitle("Ley de ohm");

       /////////

       setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
       ImageIcon imagenv = new ImageIcon(getClass().getResource("images/V.png"));
       ImageIcon imagenc = new ImageIcon(getClass().getResource("images/C.png"));
       ImageIcon imagenr = new ImageIcon(getClass().getResource("images/R.png"));
       ImageIcon imagenp = new ImageIcon(getClass().getResource("images/P.png"));
       ImageIcon imagenl = new ImageIcon(getClass().getResource("images/clear.png"));
       ImageIcon imagencl = new ImageIcon(getClass().getResource("images/calc.png"));

       /////////

       imavoltaje = new JLabel(imagenv);
       imavoltaje.setBounds(10,10,100,100);
       add(imavoltaje);

       imacorriente = new JLabel(imagenc);
       imacorriente.setBounds(10,110,100,100);
       add(imacorriente);

       imaresistencia = new JLabel(imagenr);
       imaresistencia.setBounds(10,210,100,100);
       add(imaresistencia);

       imapotencia = new JLabel(imagenp);
       imapotencia.setBounds(10,310,100,100);
       add(imapotencia);

       /////////

       limpiar = new JButton(imagenl);
       limpiar.setBounds(30,420,90,90);
       limpiar.addActionListener(this);
       add(limpiar);

       calcular = new JButton(imagencl);
       calcular.setBounds(150,420,90,90);
       calcular.addActionListener(this);
       add(calcular);

       /////////

       jvoltaje = new JLabel("Tensión");
       jvoltaje.setBounds(120,20,100,30);
       add(jvoltaje);

       jcorriente = new JLabel("Corriente");
       jcorriente.setBounds(120,120,100,30);
       add(jcorriente);

       jresistencia = new JLabel("Resistencia");
       jresistencia.setBounds(120,220,100,30);
       add(jresistencia);

       jpotencia = new JLabel("Potencia");
       jpotencia.setBounds(120,320,100,30);
       add(jpotencia);

       /////////

       voltaje = new JTextField();
       voltaje.setBounds(120,45,100,40);
       voltaje.setBackground(new Color(217, 213, 213));
       voltaje.setHorizontalAlignment(SwingConstants.CENTER);
       add(voltaje);

       corriente = new JTextField();
       corriente.setBounds(120,145,100,40);
       corriente.setBackground(new Color(217, 213, 213));
       corriente.setHorizontalAlignment(SwingConstants.CENTER);
       add(corriente);

       resistencia = new JTextField();
       resistencia.setBounds(120,245,100,40);
       resistencia.setBackground(new Color(217, 213, 213));
       resistencia.setHorizontalAlignment(SwingConstants.CENTER);
       add(resistencia);

       potencia = new JTextField();
       potencia.setBounds(120,345,100,40);
       potencia.setBackground(new Color(217, 213, 213));
       potencia.setHorizontalAlignment(SwingConstants.CENTER);
       add(potencia);

       /////////

       combovoltaje = new JComboBox();
       combovoltaje.setBounds(225,45,50,40);
       add(combovoltaje);
       combovoltaje.addItem(" V");
       combovoltaje.addItem(" KV");
       combovoltaje.addItemListener((ItemListener) this);

       combocorriente = new JComboBox();
       combocorriente.setBounds(225,145,50,40);
       add(combocorriente);
       combocorriente.addItem(" A");
       combocorriente.addItem(" mA");
       combocorriente.addItemListener(this);

       comboresistencia = new JComboBox();
       comboresistencia.setBounds(225,245,50,40);
       add(comboresistencia);
       comboresistencia.addItem(" Ω");
       comboresistencia.addItem(" KΩ");
       comboresistencia.addItem(" MΩ");
       comboresistencia.addItemListener(this);

       combopotencia = new JComboBox();
       combopotencia.setBounds(225,345,50,40);
       add(combopotencia);
       combopotencia.addItem(" W");
       combopotencia.addItem("mW");
       combopotencia.addItem(" KW");
       combopotencia.addItemListener(this);
   }

    public void itemStateChanged(ItemEvent c) {   //item_combobox

    }

    public void actionPerformed(ActionEvent a) {    //botones
        if (a.getSource() == limpiar) {
            voltaje.setText("");
            corriente.setText("");
            resistencia.setText("");
            potencia.setText("");
            combovoltaje.setSelectedIndex(0);
            combocorriente.setSelectedIndex(0);
            comboresistencia.setSelectedIndex(0);
            combopotencia.setSelectedIndex(0);
        }
        if (a.getSource() == calcular) {
            String svoltaje = voltaje.getText().trim().toString();
            String scorriente = corriente.getText().trim().toString();
            String sresistencia = resistencia.getText().trim().toString();
            String spotencia = potencia.getText().trim().toString();

            if (svoltaje.isBlank() && scorriente.isBlank() && sresistencia.isBlank() && spotencia.isBlank()) {
                JOptionPane.showMessageDialog(null, "Introducir solo dos parámetros para efectuar el cálculo. \n" +
                        "Para valores con decimales usar el punto como separador y no la coma, \n" +
                        "                                         por ejemplo: 2.45");
            }
            if (!svoltaje.isEmpty() && !scorriente.isEmpty() && !sresistencia.isEmpty() && !spotencia.isEmpty()){
                JOptionPane.showMessageDialog(null, "Introducir solo dos parámetros para efectuar el cálculo.");
            }

            ////////////////////////////////////////////

            if (!svoltaje.isEmpty() && scorriente.isBlank() && sresistencia.isBlank() && spotencia.isBlank()){
                JOptionPane.showMessageDialog(null, "Introducir solo dos parámetros para efectuar el cálculo.");
            }
            if (svoltaje.isBlank() && !scorriente.isEmpty() &&sresistencia.isBlank() && spotencia.isBlank()){
                JOptionPane.showMessageDialog(null, "Introducir solo dos parámetros para efectuar el cálculo.");
            }
            if (svoltaje.isBlank() && scorriente.isBlank() && !sresistencia.isEmpty() && spotencia.isBlank()){
                JOptionPane.showMessageDialog(null, "Introducir solo dos parámetros para efectuar el cálculo.");
            }
            if (svoltaje.isBlank() && scorriente.isBlank() && sresistencia.isBlank() && !spotencia.isEmpty()){
                JOptionPane.showMessageDialog(null, "Introducir solo dos parámetros para efectuar el cálculo.");
            }

            ////////////////////////////////////////////

            if (svoltaje.isEmpty() && !scorriente.isEmpty() && !sresistencia.isEmpty() && !spotencia.isEmpty()){
                JOptionPane.showMessageDialog(null, "Introducir solo dos parámetros para efectuar el cálculo.");
            }
            if (!svoltaje.isEmpty() && scorriente.isEmpty() && !sresistencia.isEmpty() && !spotencia.isEmpty()){
                JOptionPane.showMessageDialog(null, "Introducir solo dos parámetros para efectuar el cálculo.");
            }
            if (!svoltaje.isEmpty() && !scorriente.isEmpty() && sresistencia.isEmpty() && !spotencia.isEmpty()){
                JOptionPane.showMessageDialog(null, "Introducir solo dos parámetros para efectuar el cálculo.");
            }
            if (!svoltaje.isEmpty() && !scorriente.isEmpty() && !sresistencia.isEmpty() && spotencia.isEmpty()){
                JOptionPane.showMessageDialog(null, "Introducir solo dos parámetros para efectuar el cálculo.");
            }

            ////////////////////////////////////////////

                if (sresistencia.isBlank() && spotencia.isBlank() && !svoltaje.isEmpty() && !scorriente.isEmpty()) {
                    numvoltaje = Double.parseDouble(svoltaje);
                    numcorriente = Double.parseDouble(scorriente);

                    numresistencia = Math.ceil(numvoltaje / numcorriente);
                    numpotencia = Math.ceil(numvoltaje * numcorriente);

                    sresistencia = String.valueOf(numresistencia);
                    spotencia = String.valueOf(numpotencia);

                    resistencia.setText(sresistencia);
                    potencia.setText(spotencia);
                }
                if (scorriente.isBlank() && spotencia.isBlank() && !svoltaje.isEmpty() && !sresistencia.isEmpty()) {
                    numvoltaje = Double.parseDouble(svoltaje);
                    numresistencia = Double.parseDouble(sresistencia);

                    numcorriente = Math.ceil(numvoltaje / numresistencia);
                    numpotencia = Math.ceil(Math.pow(numvoltaje, 2) / numresistencia);

                    scorriente = String.valueOf(numcorriente);
                    spotencia = String.valueOf(numpotencia);

                    corriente.setText(scorriente);
                    potencia.setText(spotencia);
                }
                if (scorriente.isBlank() && sresistencia.isBlank() && !svoltaje.isEmpty() && !spotencia.isEmpty()) {
                    numvoltaje = Double.parseDouble(svoltaje);
                    numpotencia = Double.parseDouble(spotencia);

                    numcorriente = Math.ceil(numpotencia / numvoltaje);
                    numresistencia = Math.ceil(Math.pow(numvoltaje, 2) / numpotencia);

                    scorriente = String.valueOf(numcorriente);
                    sresistencia = String.valueOf(numresistencia);

                    corriente.setText(scorriente);
                    resistencia.setText(sresistencia);
                }

                ////////////////////////////////////////////

                if (svoltaje.isBlank() && spotencia.isBlank() && !scorriente.isEmpty() && !sresistencia.isEmpty()) {
                    numcorriente = Double.parseDouble(scorriente);
                    numresistencia = Double.parseDouble(sresistencia);

                    numvoltaje = Math.ceil(numcorriente * numresistencia);
                    numpotencia = Math.ceil(numresistencia * Math.pow(numcorriente, 2));

                    svoltaje = String.valueOf(numvoltaje);
                    spotencia = String.valueOf(numpotencia);

                    voltaje.setText(svoltaje);
                    potencia.setText(spotencia);
                }
                if (svoltaje.isBlank() && sresistencia.isBlank() && !scorriente.isEmpty() && !spotencia.isEmpty()) {
                    numcorriente = Double.parseDouble(scorriente);
                    numpotencia = Double.parseDouble(spotencia);

                    numvoltaje = Math.ceil(numpotencia / numcorriente);
                    numresistencia = Math.ceil(numpotencia / Math.pow(numcorriente, 2));

                    svoltaje = String.valueOf(numvoltaje);
                    sresistencia = String.valueOf(numresistencia);

                    voltaje.setText(svoltaje);
                    resistencia.setText(sresistencia);
                }

                //////////////////////////////////////

                if (svoltaje.isBlank() && scorriente.isBlank() && !sresistencia.isEmpty() && !spotencia.isEmpty()) {
                    numresistencia = Double.parseDouble(sresistencia);
                    numpotencia = Double.parseDouble(spotencia);

                    numvoltaje = Math.ceil(Math.sqrt(numpotencia * numresistencia));
                    numcorriente = Math.ceil(Math.sqrt(numpotencia / numresistencia));

                    svoltaje = String.valueOf(numvoltaje);
                    scorriente = String.valueOf(numcorriente);

                    voltaje.setText(svoltaje);
                    corriente.setText(scorriente);
                }
            }
        }

    public static void main(String []args){
       Ohm Ohm1 = new Ohm();
       Ohm1.setBounds(0,0,320,580);
       Ohm1.setVisible(true);
       Ohm1.setResizable(false);
       Ohm1.setLocationRelativeTo(null);
    }
}
