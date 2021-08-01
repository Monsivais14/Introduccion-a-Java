import java.util.Scanner;

public class Vacacional {
 public static void main(String args[]){

     java.util.Scanner in = new java.util.Scanner(System.in);
     String nombre = "";
     int clave;
     int antiguedad;
     int dias;

     System .out.print("");
     System .out.print("                                        ___   __        .ama     ,\n" +
             "      ,d888a                          ,d88888888888ba.  ,88\"I)   d\n" +
             "     a88']8i                         a88\".8\"8)   `\"8888:88  \" _a8'\n" +
             "   .d8P' PP                        .d8P'.8  d)      \"8:88:baad8P'\n" +
             "  ,d8P' ,ama,   .aa,  .ama.g ,mmm  d8P' 8  .8'        88):888P'\n" +
             " ,d88' d8[ \"8..a8\"88 ,8I\"88[ I88' d88   ]IaI\"        d8[         \n" +
             " a88' dP \"bm8mP8'(8'.8I  8[      d88'    `\"         .88          \n" +
             ",88I ]8'  .d'.8     88' ,8' I[  ,88P ,ama    ,ama,  d8[  .ama.g\n" +
             "[88' I8, .d' ]8,  ,88B ,d8 aI   (88',88\"8)  d8[ \"8. 88 ,8I\"88[\n" +
             "]88  `888P'  `8888\" \"88P\"8m\"    I88 88[ 8[ dP \"bm8m88[.8I  8[\n" +
             "]88,          _,,aaaaaa,_       I88 8\"  8 ]P'  .d' 88 88' ,8' I[\n" +
             "`888a,.  ,aadd88888888888bma.   )88,  ,]I I8, .d' )88a8B ,d8 aI\n" +
             "  \"888888PP\"'        `8\"\"\"\"\"\"8   \"888PP'  `888P'  `88P\"88P\"8m\"");
     System .out.println("");
     System .out.println("");
     System.out.println("Bienvenido a sistema vacacional de Coca-Cola Company");
     System.out.println("¿Cual es el nombre del trabajador?");
     nombre = in.nextLine();
     System .out.println("");
     System.out.println("¿Cuantos años de servicio tiene el trabajador?");
     antiguedad = in.nextInt();
     System.out.println("¿Cual es la clave de su departamento?");
     clave = in.nextInt();

     ///////////////////////////////////////////////////////////////////////////////////////////////

     if(clave >= 4){
         System.out.println("Error departamento con clave " + clave + " no existente");
         System.exit(0);
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
             System.out.println(nombre + ", Aun no tienes derecho a vacaciones.");
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