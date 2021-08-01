import java.util.Scanner;
import java.util.jar.JarEntry;

public class Equals {
 public static void main(String args[]){

     Scanner in = new java.util.Scanner(System.in);

     String nombre1 = "";
     String nombre2 = "";

     System.out.println("");
     System.out.println("Comparare dos nombres");
     System.out.println("");
     System.out.println("¿Cual es el primer nombre?");
     nombre1 = in.nextLine();
     System.out.println("¿Cual es el segundo nombre?");
     nombre2 = in.nextLine();

     if(nombre1.equalsIgnoreCase(nombre2)){
         System.out.println("Son el mismo nombre");
     }else{
         System.out.println("No son el mismo nombre");
     }
 }
}
