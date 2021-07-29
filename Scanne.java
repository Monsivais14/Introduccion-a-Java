import java.util.Scanner;

public class Scanne {
 public static void main(String args[]){

     java.util.Scanner in = new java.util.Scanner(System.in);
     String nombre = "";
     int num1 = 0, num2 = 0, resultado = 0;

     System.out.println("Cual es tu nombre?");
     nombre = in.nextLine();

     System.out.println("Dame el primer valor para tu suma");
     num1 = in.nextInt();

     System.out.println("Dame el segundo valor para tu suma");
     num2 = in.nextInt();

     resultado = num1 + num2;

     System.out.println("Hola " + nombre + " el resulyado de tu suma es: " + resultado);
 }
}

