import java.util.Scanner;
import java.io.*;
import java.util.*;
class Pokedex{
    //3IV8, Aguirre Gutiérrez Mauricio Alberto
    //javac Pokedex.java
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
       
        char letra,x;
        int opcion, numero;
        
    do{
        
       System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- charmander  ");
        System.out.println("2.- bulbasaor");
        System.out.println("3.- squartle ");
        System.out.println("4.- batalla ");
        System.out.println("5.- Salir ");
        
        opcion = entrada.nextInt();
        
        switch (opcion) {
            case 1:
        System.out.println("nombre: charmander ");
        System.out.println("energía vital: 5");
        System.out.println("id: 4040 ");
        System.out.println("fuerza: 8 ");
        System.out.println("defensa: 7 ");
        System.out.println("vida: 7 ");
        System.out.println("ataque principal: 8 ");
        System.out.println("ataque secundario:1 ");
                break;

        case 2:
        System.out.println("nombre: bulbasaor ");
        System.out.println("energía vital: 7");
        System.out.println("id: 6060 ");
        System.out.println("fuerza: 9 ");
        System.out.println("defensa: 6 ");
        System.out.println("vida: 8 ");
        System.out.println("ataque principal: 9 ");
        System.out.println("ataque secundario: 1 ");
                break;

        case 3:
        System.out.println("nombre: squartle ");
        System.out.println("energía vital: 8");
        System.out.println("id: 6969 ");
        System.out.println("fuerza: 10 ");
        System.out.println("defensa: 7 ");
        System.out.println("vida: 6 ");
        System.out.println("ataque principal: 10 ");
        System.out.println("ataque secundario: 2 ");
                break;
        case 4:
        Scanner entra = new Scanner(System.in);
        do{
        System.out.println("escoja un numero de 1 al 16 ");
        numero = entrada.nextInt();
        if (numero == 6 || numero == 2 || numero == 8 || numero == 4){
        System.out.println("Bulbasor vence a Charmander ");
        System.out.println("ataco con ataque principal");
        System.out.println("Charmander quedo debilitado");}
        if (numero == 5 || numero == 1 || numero == 7){
        System.out.println("Charmander vence a Bulbasor ");
        System.out.println("ataco con ataque principal");
        System.out.println("Charmander quedo debilitado");}
        if (numero == 3 || numero == 9 || numero == 10){
        System.out.println("Squartle vence a Charmander ");
        System.out.println("ataco con ataque principal");
        System.out.println("Charmander quedo debilitado");}
        if (numero == 16 || numero == 12 || numero == 13){
        System.out.println("Charmander vence a Squartle ");
        System.out.println("ataco con ataque principal");
        System.out.println("Charmander quedo debilitado");}
        else{
        System.out.println("Bulbasor vence a Squartle ");
        System.out.println("ataco con ataque principal");
        System.out.println("Charmander quedo debilitado");}
        

       System.out.println("Desea jugar de nuevo? diga r ");
       x = entra.next().charAt(0);
        }while (x == 'r');
         
                break;

        default:
                System.out.println("Gracias por jugar. ");
                
        }
        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
        
        letra = entrada.next().charAt(0);
        
    }while(letra == 's');
        
    }
}