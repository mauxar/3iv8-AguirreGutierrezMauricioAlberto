import java.util.Scanner;
public class o{

    //juno ju = new jupalabra();

    public static void main(String[] args){
        String []  palabras = {"elefante", "amor", "casa"};
        int posicionAleatoria = (int) Math.floor(Math.random()*(palabras.length));
        String palabra = palabras[posicionAleatoria];

        char letras [i] = palabra.toCharArray();
        char letrasguion [i] = new char[letras.length];

        for(int i=0; i<letras.length; i++){
           letrasguion[i]='_';
        }
        System.out.println(letrasguion);

        boolean hemosganado = false;
        while(hemosganado==false){
        System.out.println("Introduce una letra");
        //Scanner lector = new Scanner(System.in);
        //char letraintro = lector.next().chartAt(1);

        for(int i=0; i<letras.length; i++){
            if(letras[i]==letraintro){
                letrasguion[i]=letraintro;
            }
        }
        for(int i=0; i<letras.length; i++){
        if((letra[i]='_'){
            System.out.println("exito");}
        }
        System.out.println(letrasguion);
    }
    }
        
}