import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class InterfazTerminos extends JFrame implements ChangeListener,ActionListener{

    private JLabel label;
    private JCheckBox box1;
    private JButton boton1;

    public InterfazTerminos(){
        setLayout(null);
        label = new JLabel("Aceptar terminos y condiciones");
        label.setBounds(10,10,400,30);
        add(label);

        box1 = new JCheckBox("Acepto");
        box1.setBounds(10,50,100,30);
        box1.addChangeListener(this);
        add(box1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10,100,100,30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()== boton1){
            System.exit(0);
        }
    }

    public void stateChanged(ChangeEvent changeEvent) {
        if(box1.isSelected()==true){
            boton1.setEnabled(true);
        }
        else{
            boton1.setEnabled(false);
        }
    }

    public static void main(String []args){
        InterfazTerminos InterfazTerminos1 = new InterfazTerminos();
        InterfazTerminos1.setBounds(0,0,300,200);
        InterfazTerminos1.setResizable(false);
        InterfazTerminos1.setLocationRelativeTo(null);
        InterfazTerminos1.setVisible(true);
    }
}
