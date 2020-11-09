import java.util.*;
//javac NumEntero.java

public class NumEntero{

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        
        int array[] = new int [10];
        int n=0,p=0;
        char repetir;

        float negativo=0, positivo=0;

        do{
            for(int i=0; i<array.length; i++){
                System.out.println("Ingresa el digito "+ i + " : ");
                array[i] = entrada.nextInt();

                
            }
            
     

        

       for(int i=0; i<array.length; i++){
        
        if (array[i]<0){

        
                
                negativo= array[i]+negativo;
                n=n+1;

            }
        else {

        
                
                positivo= array[i]+positivo;
                p=p+1;

            }
       }
            
            System.out.println(String.format("promedio de los negativos: %f ",negativo/n));
             
            System.out.println();

            System.out.println(String.format("promedio de los positivos: %f ",positivo/p));

             System.out.println("¿Deseas repetir el programa?, si lo desea escriba r");
    repetir = entrada.next().charAt(0);
        
    }while(repetir=='r');        
        
        

    }}