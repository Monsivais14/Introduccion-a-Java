import java.util.Scanner;

public class Usuario{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        String user = ("");
        String password = ("");
        String Usernew = ("");
        String Passwordnew = ("");

        System.out.println("");
        System.out.println("╔══╗───────────────────╔╗───────╔═╗╔═╦═══╦═══╗\n" +
                        "║╔╗║───────────────────║║───────║║╚╝║║╔═╗║╔═╗║\n" +
                        "║╚╝╚╦╦══╦═╗╔╗╔╦══╦═╗╔╦═╝╠══╗╔══╗║╔╗╔╗║╚══╣║─╚╝\n" +
                        "║╔═╗╠╣║═╣╔╗╣╚╝║║═╣╔╗╬╣╔╗║╔╗║║╔╗║║║║║║╠══╗║║╔═╗\n" +
                        "║╚═╝║║║═╣║║╠╗╔╣║═╣║║║║╚╝║╚╝║║╔╗║║║║║║║╚═╝║╚╩═║\n" +
                        "╚═══╩╩══╩╝╚╝╚╝╚══╩╝╚╩╩══╩══╝╚╝╚╝╚╝╚╝╚╩═══╩═══╝");


        System.out.println("Inglesa el nombre de usuario");
        user =  in.nextLine();
        System.out.println("");

        System.out.println("Contraseña");
        password =  in.nextLine();
        System.out.println("");

        if(user.equalsIgnoreCase("Uriel") && password.equalsIgnoreCase("U124")){
            System.out.println("Bievenido Uriel");
        }else{
            System.out.println("Contraseña o nombre de usuario incorrecto.");
        }














    }
}


