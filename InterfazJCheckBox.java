import javax.swing.*;
import javax.swing.event.*;

public class InterfazJCheckBox extends JFrame implements ChangeListener{

    private JCheckBox box1,box2,box3;

    public InterfazJCheckBox(){
        setLayout(null);
        box1 = new JCheckBox("Ingles");
        box1.setBounds(10,10,150,30);
        box1.addChangeListener(this);
        add(box1);

        box2 = new JCheckBox("Frances");
        box2.setBounds(10,50,150,30);
        box2.addChangeListener(this);
        add(box2);

        box3 = new JCheckBox("Aleman");
        box3.setBounds(10,90,150,30);
        box3.addChangeListener(this);
        add(box3);
    }

    public void stateChanged(ChangeEvent e) {

        String cadena= "";

        if(box1.isSelected()==true){
            cadena = cadena + "ingles-";
            setTitle(cadena);
        }
        if(box2.isSelected()==true){
            cadena = cadena + "Frances-";
            setTitle(cadena);
        }
        if(box3.isSelected()==true){
            cadena = cadena + "Aleman-";
            setTitle(cadena);
        }

    }

    public static void main(String []args){
        InterfazJCheckBox InterfazJCheckBox1 = new InterfazJCheckBox();
        InterfazJCheckBox1.setBounds(0,0,400,400);
        InterfazJCheckBox1.setVisible(true);
        InterfazJCheckBox1.setResizable(false);
        InterfazJCheckBox1.setLocationRelativeTo(null);

    }
}
