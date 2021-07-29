import java.util.Scanner;

public class Vacacional {
 public static void main(String args[]){

     java.util.Scanner in = new java.util.Scanner(System.in);
     String nombre = "";
     int clave;
     int antiguedad;
     int dias;

     System.out.println("Bienvenido a sistema vacacional de Coca-Cola Company");
     System.out.println("¿Cual es el nombre del trabajador?");
     nombre = in.nextLine();

     System.out.println("¿Cuantos años de servicio tiene el trabajador?");
     antiguedad = in.nextInt();

     System.out.println("¿Cual es la clave de su departamento?");
     clave = in.nextInt();

     ///////////////////////////////////////////////////////////////////////////////////////////////

     if(clave >4){
         System.out.println("Error clave " + clave + " no existente");
     }
     if(clave == 3){
         if(antiguedad == 1){
             dias = 10;
             System.out.println(nombre + ",Tienes derecho a " + dias + " dias de vacaciones.");
         }if(antiguedad >=2 && antiguedad <=6){
             dias= 20;
             System.out.println(nombre + ",Tienes derecho a " + dias + " dias de vacaciones.");
         }if(antiguedad >=7){
             dias= 30;
             System.out.println(nombre + ",Tienes derecho a " + dias + " dias de vacaciones.");
         }if(antiguedad <1){
             dias = 0;
             System.out.println(", Aun no tienes derecho a vacaciones.");
         }
     }
     if(clave == 2){
         if(antiguedad == 1){
             dias =7;
             System.out.println(nombre + ", Tienes derecho a " + dias + " dias de vacaciones.");
         }if(antiguedad >=2 && antiguedad <=6){
             dias =15;
             System.out.println(nombre + ", Tienes derecho a " + dias + " dias de vacaciones.");
         }if(antiguedad >=7){
             dias =22;
             System.out.println(nombre + ", Tienes derecho a " + dias + " dias de vacaciones.");
         }if(antiguedad <1){
             dias = 0;
             System.out.println(nombre + ", Aun no tienes derecho a vacaciones.");
         }
     }
     if(clave == 1){
         if(antiguedad == 1){
             dias = 6;
             System.out.println(nombre + ", Tienes derecho a " + dias + " dias de vacaciones");
         }if(antiguedad >=2 && antiguedad <=6){
             dias = 14;
             System.out.println(nombre + ", Tienes derecho a " + dias + " dias de vacaciones");
         }if(antiguedad >=7){
             dias = 20;
             System.out.println(nombre + ", Tienes derecho a " + dias + " dias de vacaciones");
         }if(antiguedad <1){
             dias = 0;
             System.out.println(nombre + ", Aun no tienes derecho a vacaciones.");
         }
     }
 }
}