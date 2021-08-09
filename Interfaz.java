import javax.swing.*;

public class Interfaz extends JFrame{
    private JLabel label1;

    public Interfaz() {
        setLayout(null);
        label1 = new JLabel("Hola mundo");
        label1.setBounds(100, 100, 700, 300);
        add(label1);
    }
    public static void main(String []args){
        Interfaz Interfaz1 = new Interfaz();
        Interfaz1.setBounds(0,0,400,400);
        Interfaz1.setVisible(true);
        Interfaz1.setLocationRelativeTo(null);
    }
}
