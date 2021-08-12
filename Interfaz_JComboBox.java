import javax.swing.*;
import java.awt.event.*;

public class Interfaz_JComboBox extends JFrame implements ItemListener{

    private JComboBox combobox;

    public Interfaz_JComboBox(){
        setLayout(null);

        combobox = new JComboBox();
        combobox.setBounds(10,10,80,20);
        add(combobox);

        combobox.addItem("Rojo");
        combobox.addItem("Verde");
        combobox.addItem("Azul");
        combobox.addItem("Amarillo");
        combobox.addItem("Negro");
        combobox.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == combobox){
            String seleccion = combobox.getSelectedItem().toString();
            setTitle(seleccion);
        }
    }
    public static void main(String []args){
        Interfaz_JComboBox Interfaz_JComboBox1 = new Interfaz_JComboBox();
        Interfaz_JComboBox1.setBounds(0,0,300,150);
        Interfaz_JComboBox1.setVisible(true);
        Interfaz_JComboBox1.setResizable(false);
        Interfaz_JComboBox1.setLocationRelativeTo(null);
    }
}
