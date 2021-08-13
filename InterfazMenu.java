import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfazMenu extends JFrame implements ActionListener{

    private JMenuBar barra;
    private JMenu menu1;
    private JMenuItem rojo,verde,azul;

    public InterfazMenu(){
        setLayout(null);

        barra = new JMenuBar();
        setJMenuBar(barra);

        menu1 = new JMenu("Opciones");
        barra.add(menu1);

        rojo = new JMenuItem("Rojo");
        rojo.addActionListener(this);
        menu1.add(rojo);

        verde = new JMenuItem("Verde");
        verde.addActionListener(this);
        menu1.add(verde);

        azul = new JMenuItem("Azul");
        azul.addActionListener(this);
        menu1.add(azul);
    }
    public void actionPerformed(ActionEvent e) {
        Container fondo = this.getContentPane();

        if(e.getSource()== rojo){
            fondo.setBackground(new Color(255,0,0));
        }
        if(e.getSource()== verde){
            fondo.setBackground(new Color(0,250,0));
        }
        if(e.getSource()== azul){
            fondo.setBackground(new Color(0,0,255));
        }
    }
    public static void main(String []args){
        InterfazMenu InterfazMenu1 = new InterfazMenu();
        InterfazMenu1.setBounds(0,0,400,300);
        InterfazMenu1.setVisible(true);
        InterfazMenu1.setLocationRelativeTo(null);
    }
}
