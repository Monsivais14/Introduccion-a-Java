import javax.swing.*;
import javax.swing.event.*;

public class InterfazJRadio extends JFrame implements ChangeListener{

    private JRadioButton radio1,radio2,radio3,radio0;
    private ButtonGroup bg;

    public InterfazJRadio(){
        setLayout(null);
        bg = new ButtonGroup();

        radio1 = new JRadioButton("640x480");
        radio1.setBounds(10,20,100,30);
        radio1.addChangeListener(this);
        add(radio1);
        bg.add(radio1);

        radio2 = new JRadioButton("800x600");
        radio2.setBounds(10,70,100,30);
        radio2.addChangeListener(this);
        add(radio2);
        bg.add(radio2);

        radio3 = new JRadioButton("1024x768");
        radio3.setBounds(10,120,100,30);
        radio3.addChangeListener(this);
        add(radio3);
        bg.add(radio3);

        radio0 = new JRadioButton("Origen");
        radio0.setBounds(10,170,100,30);
        radio0.addChangeListener(this);
        add(radio0);
        bg.add(radio0);
    }

    public void stateChanged(ChangeEvent changeEvent) {
        if(radio1.isSelected()){
            setSize(640,480);
        }
        if(radio2.isSelected()){
            setSize(800,600);
        }
        if(radio3.isSelected()){
            setSize(1024,768);
        }
        if(radio0.isSelected()){
            setSize(350,245);
        }
    }

    public static void main(String []args){
        InterfazJRadio InterfazJRadio1 = new InterfazJRadio();
        InterfazJRadio1.setBounds(0,0,350,245);
        InterfazJRadio1.setVisible(true);
        InterfazJRadio1.setLocationRelativeTo(null);
        InterfazJRadio1.setResizable(false);
    }
}

