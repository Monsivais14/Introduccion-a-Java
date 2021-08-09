import javax.swing.*;

public class Interfaz3 extends JFrame{

   private JLabel label1; //declarar el Jlabel y usar un nombre de etiqueta, de fomra provada solo sirve en esa misma clase
   private JLabel label2;

   public Interfaz3(){                         // el constructor se tiene que llamar de la misma manera que la clase actual
       setLayout(null);                        //colocar elementos en coordenadas
       label1 = new JLabel("Hola mundo. ");    //mensaje en pantalla
       label1.setBounds(10,20,300,50);         //dimenciones de la etiqueta (separacion a la derecha, hacia abajo || ancho y alto)
       add(label1);                            //linea que dice agregar a dicha etiqueta

       label2 = new JLabel("v1.0 de Interfaz Grafica");
       label2.setBounds(10,100,200,30);
       add(label2);
   }
   public static void main(String []args){     //arranque de programa
       Interfaz3 Interfaz4 = new Interfaz3();  //objeto de interfaz, mismo nombre que la clase
       Interfaz4.setBounds(0,0,300,200);       //donde aparece || ancho y altura de interfaz
       Interfaz4.setResizable(false);          //no dejar modificar a el usuario tamano de la interfaz
       Interfaz4.setLocationRelativeTo(null);  //aparesca en el centro
       Interfaz4.setVisible(true);             //que la interfaz sea visible
   }
}
