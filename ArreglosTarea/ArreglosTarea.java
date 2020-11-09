// javac ArreglosTarea.java
import java.util.Scanner;
import java.io.*;
import java.util.*;


public class ArreglosTarea{

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        
        int matriz[] = new int [10];
        int c=0,total=0,i,opcion,mayor,menor,opc;
        float tota=0,z=0;
        float calificaciones=0;
        int matriza[][] = new int [3][3];
        int matrizb[][] = new int [3][3];
        int matrizc[][] = new int [3][3];
        float par=0; 
        int array[] = new int [10];
        int n=0,p=0,pa=0;
        char repetir;
        float negativo=0, positivo=0;


            /*for(i=0; i<matriz.length; i++){
                System.out.println("Ingresa el digito "
                + i + " : ");
                matriz[i] = entrada.nextInt();}*/
                
            
            
     do{
        
       System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- programa que lee por el teclado 10 numeros negativos y positivos y lo demas");
        System.out.println("2.- programa que lee 10 numeros enteros y da el promedio pares del arreglo.");
        System.out.println("3.- Realice un programa que permita leer 10 calificaciones de una asignatura y los guarde en un array para que muestre");
        System.out.println("4.- Leer una matriz A de 3X3 y una matriz B de 3X3 y sumarla en la matriz S. ");
        
        opc = entrada.nextInt();
        
        switch (opc) {
        
        case 1:
         do{
            for( i=0; i<array.length; i++){
                System.out.println("Ingresa el digito "+ i + " : ");
                array[i] = entrada.nextInt();
                }
       for(i=0; i<array.length; i++){
        
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
                break;

        case 2:
        
        do{

            for(i=0; i<matriz.length; i++){
                System.out.println("Ingresa el digito "
                + i + " : ");
                matriz[i] = entrada.nextInt();

                
            }
       for(i=0; i<matriz.length; i++){
        if (i % 2 == 0 ){
                par= matriz[i]+par;
                pa=pa+1; 
            } }
            System.out.println(String.format("promedio de los pares: %f ",
             par/pa));
               
    System.out.println("¿Deseas repetir el programa?, si lo desea escriba r");
    repetir = entrada.next().charAt(0);
        
    }while(repetir=='r');
                break;

        case 3:

        for(i=0; i<matriz.length; i++){
                System.out.println("Ingresa el digito "
                + i + " : ");
                matriz[i] = entrada.nextInt();}
                
            
            
     do{
        
       System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Imprimir todas las calificaciones.");
        System.out.println("2.- Promedio de las calificaciones.");
        System.out.println("3.- La calificacion mas alta y la mas baja.");
        System.out.println("4.- El numero de calificaciones superiores al promedio.  ");
        System.out.println("5.- La cantidad de alumnos aprobados y reprobados. ");
        
        opcion = entrada.nextInt();
        
        switch (opcion) {
        
        case 1:
        for(i = 0; i<matriz.length; i++){
                
                
                System.out.println(String.format(" %d ", matriz[i]));

            }
             
            System.out.println();
                break;

        case 2:
        
        for(i = 0; i<matriz.length; i++){
                
                tota= matriz[i]+tota;

            }
            
            System.out.println(String.format("promedio: %f ",tota/matriz.length));
             
            System.out.println();
                break;

        case 3:
        mayor=menor=matriz[0];
        for(i = 0; i<matriz.length; i++){
            if(matriz[i]>mayor){
               mayor=matriz[i]; 
            }
            if(matriz[i]<menor){
               menor=matriz[i]; 
            }

            }
            
            System.out.println(String.format("numero mayor: %d ",mayor));
            System.out.println(String.format("numero menor: %d ",menor));
             
            System.out.println();
                break;

        case 4:
        
        for(i = 0; i<matriz.length; i++){
                
                tota= matriz[i]+tota;
                z=tota/matriz.length;

            }
            System.out.println(String.format("promedio: %f ",z)); 
            for(i = 0; i<matriz.length; i++){
            if (matriz[i]>z){
            System.out.println(String.format("calificaciones mayores al promedio: %d ",matriz[i]));    

             }}
            
             
            System.out.println();
                break;

        case 5:
        
        for(i = 0; i<matriz.length; i++){
            if (matriz[i]<6){
            System.out.println(String.format("reprobado con: %d ",matriz[i])); }
            if (matriz[i]>5){
            System.out.println(String.format("aprobado con: %d ",matriz[i]));}   
        }
             
            System.out.println();
                break;


        
        }
       

             System.out.println("¿Deseas repetir el programa?, si lo desea escriba r");
    repetir = entrada.next().charAt(0);
        
    }while(repetir=='r');
                break;

        case 4:
        
        for(i=0; i<matriza.length; i++){
            
            for(int j=0; j<matriza.length; j++){
                System.out.println("Ingresa el numero de la fila "
                + i + " columna " + j + " : ");
                matriza[i][j] = entrada.nextInt();
            }
        }
        for( i=0; i<matrizb.length; i++){
            
            for(int j=0; j<matrizb.length; j++){
                System.out.println("Ingresa el numero de la fila "
                + i + " columna " + j + " : ");
                matrizb[i][j] = entrada.nextInt();
            }
        }
        
        for( i=0; i<matrizc.length; i++){
            
            for(int j=0; j<matrizc.length; j++){
                matrizc[i][j] = matriza[i][j] + matrizb[i][j];
            }
        }
        

        for( i = 0; i<matrizc.length; i++){

            for(int j = 0; j<matrizc.length; j++){
                
                System.out.print("[" + matrizc [i][j] + "]");
                j++;
                System.out.print("[" + matrizc [i][j] + "]");
                j++;
                System.out.println("[" + matrizc [i][j] + "]");
                //System.out.print(String.format(" %d ", matrizc[i][j]));
                 }}
                break;


        
        }
            System.out.println("¿Deseas ir al menu principal?, si lo desea escriba r");
    repetir = entrada.next().charAt(0);
        
    }while(repetir=='r');        
        
        

    }}