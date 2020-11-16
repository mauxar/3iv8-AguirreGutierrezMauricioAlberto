
import java.util.Scanner;

public class operaciones{

    Scanner entrada = new Scanner(System.in);


    public void instancia(){

        char operacion,repetir; 
        int opc,anio,ano,base,altura;
        
do{
        System.out.println("Escoje el ejercicio deseado:");
        System.out.println("1.- EJERCICIO 1");
        System.out.println("2.- Calcular el area de un cuadrado ");
        System.out.println("3.- Calcular el area de un triangulo ");
        System.out.println("4.- Calcular el area de un circulo ");
        System.out.println("5.- Calcular el area y perimetro del rectangulo");
        System.out.println("6.- EJERCICIO 3");
        System.out.println("7.- salir");
        opc= entrada.nextInt();
        switch(opc){
        
            case 1:
                System.out.println("En que anio nacio? ");
                 anio = entrada.nextInt();

                System.out.println("En que anio esta? ");
                 ano = entrada.nextInt();
                
                EJERCICIO1(anio,ano);

                System.out.println("¿Deseas repetir el programa?, si lo desea escriba r");
                repetir = entrada.next().charAt(0);    
                break;
            
            case 2 :
                System.out.println("Ingresa el valor del lado");
                base = entrada.nextInt();
            EJERCICIO2(base);
            break; 
            case 3:
                System.out.println("Ingresa el valor de la base");
                 base = entrada.nextInt();
                System.out.println("Ingresa el valor de la altura");
                 altura = entrada.nextInt();
            EJERCICIO3(base,altura);
            break; 
            case 4:
                System.out.println("Ingresa el valor de la radio");
                base = entrada.nextInt();
            EJERCICIO4(base);
            break; 
            case 5:
                System.out.println("Ingresa el valor de la base");
                 base = entrada.nextInt();
                System.out.println("Ingresa el valor de la altura");
                 altura = entrada.nextInt();
                EJERCICIO5(base,altura);
                break;  

            case 6:

                EJERCICIO6();
                break;                    
            case 7:

                EJERCICIO7();
                break;

        }System.out.println("¿Deseas repetir el programa?, si lo desea escriba r");
    repetir = entrada.next().charAt(0);
        }while(repetir=='r');  
    }

    private void EJERCICIO1(int n1, int n2){
       int edad=n2-n1;
        System.out.println("su edad es "+ edad);
    }

    
    private void EJERCICIO2(int n1){
                int perimetro = n1*4;
                double resultado = n1*n1;
                System.out.println("El area del cuadrado es de: "+resultado);
                System.out.println("El perimetro del cuadrado es de: "+perimetro);
                }
    
    private void EJERCICIO3(int n1,int n2){
               int perimetro = n1*2+n2*2;
               double resultado = (n1*n2)/2;
                System.out.println("El area del triangulo es de: "+resultado);
                System.out.println("El perimetro del triangulo es de: "+perimetro);}
    private void EJERCICIO4(int n1){           
                double perimetro = 3.1416*n1*2;
                double resultado = 3.1416*n1*n1;
                System.out.println("El area del circulo es de: "+resultado);
                System.out.println("El perimetro del circulo es de: "+perimetro);}
    private void EJERCICIO5(int n1,int n2){            
                int perimetro = 2*n1 + 2*n2;
                double resultado = n1*n2;
                System.out.println("El area del rectangulo es de: "+resultado);
                System.out.println("El perimetro del rectangulo es de: "+perimetro);}

               

    public void EJERCICIO6(){
    
    }

    private void EJERCICIO7(){
System.out.println("adios. ");
    }

    
}