import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfazSubMenu extends JFrame implements ActionListener{

    private JMenuBar menubar;
    private JMenu menu1,menu2,menu3;
    private JMenuItem item1,item2,item3,item4,item5;

    public InterfazSubMenu(){
        setLayout(null);
        menubar = new JMenuBar();
        setJMenuBar(menubar);

        menu1 = new JMenu("Opciones");
        menubar.add(menu1);
        menu2= new JMenu("Resolucion");
        menu1.add(menu2);
        menu3 = new JMenu("Color de fondo");
        menu1.add(menu3);

        item3 = new JMenuItem("1280x720");
        menu2.add(item3);
        item3.addActionListener(this);
        item1 = new JMenuItem("320x200");
        menu2.add(item1);
        item1.addActionListener(this);
        item2 = new JMenuItem("640x480");
        menu2.add(item2);
        item2.addActionListener(this);

        item4 = new JMenuItem("Claro");
        menu3.add(item4);
        item4.addActionListener(this);
        item5 = new JMenuItem("Oscuro");
        menu3.add(item5);
        item5.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == item1){
            setSize(300,200);
        }
        if(e.getSource() == item2){
            setSize(640,480);
        }
        if(e.getSource() == item3){
            setSize(1280,720);
        }
        if(e.getSource() == item4){
            getContentPane().setBackground(new Color(255,255,255));
        }
        if(e.getSource() == item5){
            getContentPane().setBackground(new Color(128,128,128));
        }
    }
    public static void main(String []args){
        InterfazSubMenu InterfazSubMenu1 = new InterfazSubMenu();
        InterfazSubMenu1.setBounds(0,0,300,200);
        InterfazSubMenu1.setVisible(true);
        InterfazSubMenu1.setLocationRelativeTo(null);
        InterfazSubMenu1.setResizable(false);
    }
}
