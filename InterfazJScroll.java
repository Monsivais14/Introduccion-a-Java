import javax.swing.*;

public class InterfazJScroll extends JFrame{

    private JTextField textfield;
    private JTextArea textarea;
    private JScrollPane scrollpanel;

    public InterfazJScroll(){
        setLayout(null);
        textfield = new JTextField();
        textfield.setBounds(10,10,200,30);
        add(textfield);

        textarea = new JTextArea();
        scrollpanel = new JScrollPane(textarea);
        scrollpanel.setBounds(10,50,400,300);
        add(scrollpanel);
    }
    public static void main(String []args){
        InterfazJScroll InterfazJScaroll = new InterfazJScroll();
        InterfazJScaroll.setBounds(0,0,540,400);
        InterfazJScaroll.setVisible(true);
        InterfazJScaroll.setResizable(false);
        InterfazJScaroll.setLocationRelativeTo(null);
    }
}
