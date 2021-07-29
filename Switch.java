public class Switch {
 public static void main(String args[]){

   int num1 = 5;
   int num2 = 3;
   int resultado = 0;
   int parametro = 1;

   switch(parametro){

       case 1: resultado = num1 + num2;
               System.out.println("El resultado de la suma es  " + resultado);
               break;
       case 2: resultado = num1 - num2;
               System.out.println("El resultado de la resta es  " + resultado);
               break;
       case 3: resultado = num1 * num2;
           System.out.println("El resultado de la resta es  " + resultado);
           break;
       case 4: resultado = num1 / num2;
           System.out.println("El resultado de la division es  " + resultado);
           break;

       default: System.out.println("No existe");
;

   }
 }
}
