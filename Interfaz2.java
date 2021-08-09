import javax.swing.*;

public class Interfaz2 extends JFrame {
    public Interfaz2(){  // el constructor se tiene que llamar de la misma manera que la clase actual
        setLayout(null); //indicar a el programa el uso de coordenadas
    }
    public static void main(String args[]){
        Interfaz2 Interfaz3 = new Interfaz2();
        Interfaz3.setBounds(350,350,1020,720); //coordenadas de donde se situa izquierda, alto || ancho, largo de interfaz
        Interfaz3.setVisible(true); // true para que se vea || false no se vea
        Interfaz3.setLocationRelativeTo(null); //inicair programa en el centro de la pantalla sin importar coordenadas setBounds
        Interfaz3.setResizable(false); //no permitir modificar el tamano de la interfaz


    }
}
