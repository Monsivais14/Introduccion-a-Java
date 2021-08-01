public class Fibonacci {
   public static void main(String args[]){

       int a = 0;int b = 1 ;int c = 0;
       System.out.println("");
       System.out.print("Serie con For");
       System.out.println("");

       for(int i = 0; i < 10; i +=1){
           if(i < 9){
               System.out.print(a + ",");
           }else{
               System.out.print(a);
           }
           c = a + b;
           a= b;
           b = c;
       }

       a = 0;b = 1 ;c = 0;
       int i = 0;
       System.out.println("");
       System.out.print("Serie con While");
       System.out.println("");

       while(i < 10){
           if(i < 9){
               System.out.print(a + ",");
           }else{
               System.out.print(a);
           }
           c = a + b;
           a= b;
           b = c;
           i++;
       }

       a = 0;b = 1 ;c = 0;
       i = 0;
       System.out.println("");
       System.out.print("Serie con Do-While");
       System.out.println("");

      do{
           if(i < 9){
               System.out.print(a + ",");
           }else{
               System.out.print(a);
           }
           c = a + b;
           a= b;
           b = c;
           i++;
       } while(i < 10);
   }
}
