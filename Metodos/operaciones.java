import java.util.Scanner;

public class operaciones{

    Scanner entrada = new Scanner(System.in);


    public void instancia(){

        char operacion,repetir; 
        int opc,anio,ano,base,altura,credito,num;
        float llc,lli,lln;
        
do{
        System.out.println("Escoje el ejercicio deseado:");
        System.out.println("1.- EJERCICIO 1");
        System.out.println("2.- Calcular el area y perimetro de un cuadrado ");
        System.out.println("3.- Calcular el area y perimetro de un triangulo ");
        System.out.println("4.- Calcular el area y perimetro de un circulo ");
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
                break;
            
            case 2 :
                System.out.println("Ingresa el valor del lado");
                base = entrada.nextInt();
            EJERCICIO2(base);
            break; 
            

                EJERCICIO7();
                break;

        }System.out.println("¿Deseas regresar al menu principal?, si lo desea escriba r");
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

               

    private void EJERCICIO6(float credito,float lli,float lln,float llc){
            System.out.println("su numero es ");
            double suma = lli * 0.6+lln*0.5+llc*0.2;
            double total = credito - suma;
            System.out.println("Le queda "+total+" de credito\n y ha gastado"+suma+"");
            System.out.println("si desea ponerle mas credito a su celular presione 0");
            int j = entrada.nextInt();
            if(j==0){
               System.out.println("escriba cuanto desea agregar"); 
               int c = entrada.nextInt();
               double t = c+total;
               System.out.println("su nuevo saldo es de: "+t);
            }
                

    }

    private void EJERCICIO7(){
System.out.println("adios. ");
    }

    
}