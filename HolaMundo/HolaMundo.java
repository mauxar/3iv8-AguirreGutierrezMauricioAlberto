import java.util.Scanner;
import java.io.*;
import java.util.*;
class menudetareas{
    //3IV8, Aguirre Gutiérrez Mauricio Alberto
    //javac Pokedex.java
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
       
        char letra;
        int opcion, edad, tempe, numero, pastel, muffin, cafe, malteada, base, altura, lado1, lado2, radio;
        char rom, temperatura, convert;
        double  num, nume, numer, area, perimetro, volumen, resultado, monto, num1, num2;
        char letra, ope;
        int opcion, numero;
    do{
        
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- programa 1 ");
        System.out.println("2.- programa 2  ");
        System.out.println("3.- programa 3 ");
        System.out.println("4.- programa 4 ");
        System.out.println("5.- programa 5 ");
        System.out.println("6.- programa 6 ");
        System.out.println("7.- programa 7 ");
        System.out.println("8.- programa 8 ");
        System.out.println("9.- programa 9 ");
        System.out.println("10.- Salir ");
        
        opcion = entrada.nextInt();
        
        switch (opcion) {
        case 1:
        System.out.println("nombre: charmander ");
        System.out.println("energía vital: 5");
        System.out.println("id: 4040 ");
        System.out.println("fuerza: 8 ");
        System.out.println("defensa: 7 ");
        System.out.println("vida: 7 ");
        System.out.println("ataque principal: 5 ");
        System.out.println("ataque secundario:1 ");
                break;

        case 2:
        System.out.println("nombre: bulbasaor ");
        System.out.println("energía vital: 7");
        System.out.println("id: 6060 ");
        System.out.println("fuerza: 9 ");
        System.out.println("defensa: 6 ");
        System.out.println("vida: 8 ");
        System.out.println("ataque principal: 4 ");
        System.out.println("ataque secundario: 1 ");
                break;

        case 3:
        System.out.println("nombre: squartle ");
        System.out.println("energía vital: 8");
        System.out.println("id: 6969 ");
        System.out.println("fuerza: 10 ");
        System.out.println("defensa: 7 ");
        System.out.println("vida: 6 ");
        System.out.println("ataque principal: 5 ");
        System.out.println("ataque secundario: 2 ");
                break;
        
        case 4:
        System.out.println("Ingresa un numero");
                numero = entra.nextFloat();
        if(0<numero>4  ){
                    System.out.println("charmander, squartle.");
                }
                    else if(nume < 0){
                        System.out.println("Segundo numero: negativo.");
                    }
                break;

           
                
            default:
                System.out.println("Gracias por participar unu nwn/ ");

    
        }
        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
        
        letra = entrada.next().charAt(0);
        
    
    }while(letra == 's');
        
    }
}