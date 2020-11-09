// javac ArregloCalificacion.java
import java.util.Scanner;
import java.io.*;
import java.util.*;


public class ArregloCalificacion{

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        
        int matriz[] = new int [10];
        int c=0,total=0,i,opcion,mayor,menor;
        float tota=0,z=0;
        char repetir;

        float calificaciones=0;


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
        
        

    }}