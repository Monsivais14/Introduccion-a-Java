import java.util.Scanner;
public class Matrices2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int filas;
        int columnas;
        int contador = 1;


        System.out.println("Cuantas filas tendra?");
        filas = in.nextInt();

        System.out.println("Cuantas columnas tendra?");
        columnas = in.nextInt();

        int numeros[][] = new int[filas][columnas];

        for(int j = 0;j < filas; j++){
            for(int i = 0;i < columnas; i++){
                numeros[j][i] = contador;
                System.out.print("[" + numeros[j][i] + "]");
                contador++;
            }
            System.out.println("");
            }
        }
    }
