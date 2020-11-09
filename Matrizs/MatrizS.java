// javac MatrizS.java
import java.util.*;

public class MatrizS{

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        int matriza[][] = new int [3][3];
        int matrizb[][] = new int [3][3];
        int matrizc[][] = new int [3][3];

        float sumarFilas=0;
        
        for(int i=0; i<matriza.length; i++){
            
            for(int j=0; j<matriza.length; j++){
                System.out.println("Ingresa el numero de la fila "
                + i + " columna " + j + " : ");
                matriza[i][j] = entrada.nextInt();
            }
        }
        for(int i=0; i<matrizb.length; i++){
            
            for(int j=0; j<matrizb.length; j++){
                System.out.println("Ingresa el numero de la fila "
                + i + " columna " + j + " : ");
                matrizb[i][j] = entrada.nextInt();
            }
        }
        
        for(int i=0; i<matrizc.length; i++){
            
            for(int j=0; j<matrizc.length; j++){
                matrizc[i][j] = matriza[i][j] + matrizb[i][j];
            }
        }
        

        for(int i = 0; i<matrizc.length; i++){

            for(int j = 0; j<matrizc.length; j++){
                
                System.out.print("[" + matrizc [i][j] + "]");
                j++;
                System.out.print("[" + matrizc [i][j] + "]");
                j++;
                System.out.println("[" + matrizc [i][j] + "]");
                //System.out.print(String.format(" %d ", matrizc[i][j]));

            }

        }
        

    }
}