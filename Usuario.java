import java.util.Scanner;

public class Usuario{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        String mail;
        String password;
        String eleccion;
        String mails[] = new String[6];

        System.out.println("");
        System.out.println("" +
                        "╔══╗───────────────────╔╗───\n" +
                        "║╔╗║───────────────────║║───\n" +
                        "║╚╝╚╦╦══╦═╗╔╗╔╦══╦═╗╔╦═╝╠══╗\n" +
                        "║╔═╗╠╣║═╣╔╗╣╚╝║║═╣╔╗╬╣╔╗║╔╗║\n" +
                        "║╚═╝║║║═╣║║╠╗╔╣║═╣║║║║╚╝║╚╝║\n" +
                        "╚═══╩╩══╩╝╚╝╚╝╚══╩╝╚╩╩══╩══╝");

        System.out.println("***************************");
        System.out.println("Bienvenido");
        System.out.println("Deseas iniciar sesion o registrate?");
        System.out.println("Iniciar || Registrarme");
        eleccion = in.nextLine();

                                                                        // pendiente
        if(eleccion.equalsIgnoreCase("Iniciar")){
            System.out.println("Ingresa tu email");
              if(mails[0].equals("")){

              }
        }
        if(eleccion.equalsIgnoreCase("Registrarme")){
            System.out.println("Cual es tu email");
            mails[0] = in.nextLine();
        }
        else{
            System.out.println("No valido");
        }





















    }
}


