import java.util.Scanner;

public class If {
 public static void main(String args[]){

     Scanner in = new Scanner(System.in);
     int operacion = 0;
     int num1 = 0;
     int num2= 0;
     int resultado = 0;

         System.out.println("*********************************************************");
         System.out.println("**************** ¿Que operacion haras? ******************");
         System.out.println("** / 1 Suma / 2 Resta / 3 Multiplicacion / 4 Division /**");
         System.out.println("*********************************************************");
         operacion = in.nextInt();

         if(operacion == 0){
         System.out.println("Esa operacion no existe");
         System.exit(0);


     }if(operacion >= 5){
         System.out.println("Esa operacion no existe");
         System.exit(0);
     }
         System.out.println("////////////////////////////////");
         System.out.println("//¿Cual sera el primer digito///");
         System.out.println("////////////////////////////////");
         num1 = in.nextInt();
         System.out.println("/////////////////////////////////");
         System.out.println("//¿Cual sera el segundo digito?//");
         System.out.println("/////////////////////////////////");

         num2 = in.nextInt();

     if(operacion == 1){
         resultado = num1 + num2;
         System.out.println("**********************************");
         System.out.println("** El resultado de la suma es " + resultado + " **");
         System.out.println("**********************************");
     }
     else if(operacion == 2){
         resultado = num1 - num2;
         System.out.println("***************************************");
         System.out.println("**** El resultado de la resta es " + resultado + " ****");
         System.out.println("***************************************");
     }
     else if(operacion == 3){
         resultado = num1 * num2;
         System.out.println("************************************************");
         System.out.println("**** El resultado de la multiplicacion es " + resultado + " ****");
         System.out.println("************************************************");
     }
     else if(operacion == 4){
         resultado = num1 / num2;
         System.out.println("******************************************");
         System.out.println("**** El resultado de la division es " + resultado + " ****");
         System.out.println("******************************************");
     }
 }
}