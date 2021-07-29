import java.util.Scanner;

public class BC{
 public static void main(String args[]){

     Scanner in = new Scanner(System.in);
     int operacion = 0;
     int num1 = 0;
     int num2= 0;
     int resultado = 0;
     int eleccion = 0;

         System.out.println("Que operacion haras?");
         operacion = in.nextInt();

         System.out.println("cual sera el primero digito");
         num1 = in.nextInt();

         System.out.println("cual sera el segundo digito");
         num2 = in.nextInt();

     if(operacion == 1){
         resultado = num1 + num2;
         System.out.println("El resultado de la suma es " + resultado);
     }
     else if(operacion == 2){
         resultado = num1 - num2;
         System.out.println("El resultado de la resta es " + resultado);
     }
     else if(operacion == 3){
         resultado = num1 * num2;
         System.out.println("El resultado de la multiplicacion es " + resultado);
     }
     else if(operacion == 4){
         resultado = num1 / num2;
         System.out.println("El resultado de la division es " + resultado);
     }
 }
}