public class Serie1 {
 public static void main(String args[]){

     int i = 1;
     int j = 99;

     System.out.println("Serie con For: ");

     for(i = 1; i <= 5; i++){
         if(i < 5){
    System.out.print(i + ",");
    System.out.print(j + ",");
         }else{
    System.out.print(i + ",");
    System.out.print(j);
         }
         j--;
     }
     System.out.println("");

     i = 1;
     j = 99;

     System.out.println("");
     System.out.println("Serie con white: ");
     while(i <= 5){
         if(i < 5){
             System.out.print(i + ",");
             System.out.print(j + ",");
         }else{
             System.out.print(i + ",");
             System.out.print(j);
         }
                 j-=1;
                 i+=1;
             }

             System.out.println("");

        i = 1;
        j = 99;

           System .out.println(" ");
            System.out.println("Serie con DoWhile");

               do{if(i < 5){
                   System.out.print(i + ",");
                   System.out.print(j + ",");
               }else{
                   System.out.print(i + ",");
                   System.out.print(j);
               }
                   j-=1;
                   i+=1;
               }while(i <= 5);
 }
}
