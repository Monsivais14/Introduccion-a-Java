import java.util.Scanner;

public class Vectores2 {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int longitud;

        System.out.println("Cual sera la longitud");
        longitud = in.nextInt();

        int numeros[] = new int[longitud];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Dame el valor de el vector numero " + (i + 1));
            numeros[i] = in.nextInt();
        }
        for (int i = 0; i < numeros.length; i++){
            System.out.print("[" + numeros[i] + "]");
        }







}
    }