import javax.swing.*;
import java.awt.event.*;

public class CalculadoraBaseohm extends JFrame implements ActionListener{

    private JTextField cifra1,cifra2,cifra3,cifra4;
    private JLabel texto1,texto2,texto3,texto4;
    private JLabel es,fin;                                                //        pendiente
    private JButton sumar,restar,dividir,multiplicar;                     //   Quiero hacer una calculadora de ley de ohm
    private JButton restablecer;                                          //   esta es solo una idea para ver como hacer la final
    String resultado2;
    double resultado;

    public CalculadoraBaseohm(){
        setLayout(null);
        setTitle("Calculadora base ohm");

        cifra1 = new JTextField("0");
        cifra1.setBounds(75,50,100,30);
        add(cifra1);
        cifra2 = new JTextField("0");
        cifra2.setBounds(75,90,100,30);
        add(cifra2);
        cifra3 = new JTextField("0");
        cifra3.setBounds(75,130,100,30);
        add(cifra3);
        cifra4 = new JTextField("0");
        cifra4.setBounds(75,170,100,30);
        add(cifra4);

        texto1 = new JLabel("Cifra 1: ");
        texto1.setBounds(30,50,100,30);
        add(texto1);
        texto2 = new JLabel("Cifra 2: ");
        texto2.setBounds(30,90,100,30);
        add(texto2);
        texto3 = new JLabel("Cifra 3: ");
        texto3.setBounds(30,130,100,30);
        add(texto3);
        texto4 = new JLabel("Cifra 4: ");
        texto4.setBounds(30,170,100,30);
        add(texto4);

        es = new JLabel("El resultado es:");
        es.setBounds(30,20,100,30);
        add(es);
        fin = new JLabel("0");
        fin.setBounds(130,20,100,30);
        add(fin);

        sumar = new JButton("Sumar");
        sumar.setBounds(250,50,90,30);
        sumar.addActionListener(this);
        add(sumar);
        restar = new JButton("Restar");
        restar.setBounds(250,90,90,30);
        restar.addActionListener(this);
        add(restar);
        dividir = new JButton("Dividir");
        dividir.setBounds(250,130,90,30);
        dividir.addActionListener(this);
        add(dividir);
        multiplicar = new JButton("Multiplicar");
        multiplicar.setBounds(250,170,100,30);
        multiplicar.addActionListener(this);
        add(multiplicar);

        restablecer = new JButton("Restablecer");
        restablecer.setBounds(70,220,120,30);
        restablecer.addActionListener(this);
        add(restablecer);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == sumar){
            String entero1 = cifra1.getText();
            String entero2 = cifra2.getText();
            String entero3 = cifra3.getText();
            String entero4 = cifra4.getText();
            double num1=0, num2=0, num3=0, num4=0;
            num1 = Double.parseDouble(entero1);
            num2 = Double.parseDouble(entero2);
            num3 = Double.parseDouble(entero3);
            num4 = Double.parseDouble(entero4);
            resultado=num1+num2+num3+num4;
           resultado2 = String.valueOf(resultado);
           fin.setText(resultado2);
        }if(e.getSource() == restar){
            String entero1 = cifra1.getText();
            String entero2 = cifra2.getText();
            String entero3 = cifra3.getText();
            String entero4 = cifra4.getText();
            double num1,num2,num3,num4;
            num1 = Double.parseDouble(entero1);
            num2 = Double.parseDouble(entero2);
            num3 = Double.parseDouble(entero3);
            num4 = Double.parseDouble(entero4);
            resultado=num1-num2-num3-num4;
            resultado2 = String.valueOf(resultado);
            fin.setText(resultado2);
        }if(e.getSource() == dividir){
            String entero1 = cifra1.getText();
            String entero2 = cifra2.getText();
            String entero3 = cifra3.getText();
            String entero4 = cifra4.getText();
            double num1,num2,num3,num4;
            num1 = Double.parseDouble(entero1);
            num2 = Double.parseDouble(entero2);
            num3 = Double.parseDouble(entero3);
            num4 = Double.parseDouble(entero4);
            resultado=num1/num2/num3/num4;
            resultado2 = String.valueOf(resultado);
            fin.setText(resultado2);
        }if(e.getSource() == multiplicar){
            String entero1 = cifra1.getText();
            String entero2 = cifra2.getText();
            String entero3 = cifra3.getText();
            String entero4 = cifra4.getText();
            double num1,num2,num3,num4,dig2,dig3,dig4;
            String digito2,digito3,digito4;
            num1 = Double.parseDouble(entero1);
            num2 = Double.parseDouble(entero2);
            num3 = Double.parseDouble(entero3);
            num4 = Double.parseDouble(entero4);

            dig2 = num1*num2;
            digito2 = String.valueOf(dig2);
            fin.setText(digito2);

            dig3 = dig2 * num3;
            digito3 = String.valueOf(dig3);
            fin.setText(digito3);

            dig4 = dig3 * num4;
            digito4 = String.valueOf(dig4);
            fin.setText(digito4);

        }if(e.getSource() == restablecer){
            cifra1.setText("0");
            cifra2.setText("0");
            cifra3.setText("0");
            cifra4.setText("0");
            fin.setText("0");
        }
    }
    public static void main(String []args){
        CalculadoraBaseohm Calculadorabaseohm1 = new CalculadoraBaseohm();
        Calculadorabaseohm1.setBounds(0,0,400,300);
        Calculadorabaseohm1.setResizable(false);
        Calculadorabaseohm1.setVisible(true);
        Calculadorabaseohm1.setLocationRelativeTo(null);
    }
}