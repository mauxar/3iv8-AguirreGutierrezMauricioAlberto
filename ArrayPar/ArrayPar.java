import java.util.*;
//javac ArrayPar.java

public class ArrayPar{

    public static void main(String[] args){
        
        
        Scanner entrada = new Scanner(System.in);
        
        int matriz[] = new int [10];
        int p=0;
        char repetir;

        float par=0;

        do{

            for(int i=0; i<matriz.length; i++){
                System.out.println("Ingresa el digito "
                + i + " : ");
                matriz[i] = entrada.nextInt();

                
            }
            
     

        

       for(int i=0; i<matriz.length; i++){
        
        if (i % 2 == 0 ){

        
                
                par= matriz[i]+par;
                p=p+1;

            }
        
       }
            
            

            System.out.println(String.format("promedio de los pares: %f ",
             par/p));

        
    System.out.println("¿Deseas repetir el programa?, si lo desea escriba r");
    repetir = entrada.next().charAt(0);
        
    }while(repetir=='r');        

    }}