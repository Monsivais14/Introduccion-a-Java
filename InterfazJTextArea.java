import javax.swing.*;
public class InterfazJTextArea extends JFrame {

    private JTextArea textarea1;
    private JTextField textfield1;

    public InterfazJTextArea(){
        setLayout(null);
        textfield1 = new JTextField();
        textfield1.setBounds(10,10,200,30);
        add(textfield1);

        textarea1 = new JTextArea();                      //un texto de inicio puedo iniciarlo entre comillas " "
        textarea1.setBounds(10,10,200,60);
        add(textarea1);

    }


    public static void main(String args[]){
        InterfazJTextArea InterfazJTextArea1 = new InterfazJTextArea();
        InterfazJTextArea1.setBounds(0,0,640,480);
        InterfazJTextArea1.setVisible(true);
        InterfazJTextArea1.setResizable(false);
        InterfazJTextArea1.setLocationRelativeTo(null);
    }
}
