public class Operaciones{
 public static void main(String[] args){
   
   int num_1 = 4;
   int num_2 = 4;
   int num_3 = 2;
   int res = 0;
   
   res = num_1 + num_2 / num_3;
   System.out.print("El resultado incorrecto es: " + res);

   res = (num_1 + num_2) / num_3;
   System.out.print("El resultado correcto es: " + res);
 }
}