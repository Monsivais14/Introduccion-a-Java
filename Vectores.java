public class Vectores {
    public static void main(String args[]){

        System.out.println("");
        System.out.println("Estatica");
        System.out.println("");

        int numeros[] = new int[5];

        numeros[0] = 5;
        numeros[1] = 220;
        numeros[2] = 8;
        numeros[3] = 458;
        numeros[4] = 22;

        System.out.print("[" + numeros[0] + "]");
        System.out.print("[" + numeros[1] + "]");
        System.out.print("[" + numeros[2] + "]");
        System.out.print("[" + numeros[3] + "]");
        System.out.print("[" + numeros[4] + "]");

        System.out.println("");
        System.out.println("");
        System.out.println("Variable");
        System.out.println("");

        int numeros2[] = new int[5];

        for(int i = 0; i < numeros2.length; i++){
            numeros2[i] = i + 10;
            System.out.print("[" + numeros2[i] + "]");
        }



    }
}
