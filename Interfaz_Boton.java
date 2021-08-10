import javax.swing.*;
import java.awt.event.*;                        //controlar los eventos de los componentes de la interfaz(que accion hara el boton)

public class Interfaz_Boton extends JFrame implements ActionListener{ //da la orden de estar atento de alguna accion

    JButton boton1;

    public Interfaz_Boton(){                                                                                            //los btones se programan en dos partes
        setLayout(null);
        boton1 = new JButton("Cerrar ");
        boton1.setBounds(300,200,100,30);
        add(boton1);
        boton1.addActionListener(this);                //al boton uno se le agregara un evento(funcionalidad)
    }
    public void actionPerformed(ActionEvent e) {       //capturar el evento
        if (e.getSource() == boton1) {                 //contiene el objeto donde se origino el evento, se puede utilizar en varios botones
            System.exit(0);
        }
    }
        public static void main(String args[]){
            Interfaz_Boton Interfaz_Boton1 = new Interfaz_Boton();
            Interfaz_Boton1.setBounds(0,0,450,350);
            Interfaz_Boton1.setVisible(true);
            Interfaz_Boton1.setResizable(false);
            Interfaz_Boton1.setLocationRelativeTo(null);
    }
}
