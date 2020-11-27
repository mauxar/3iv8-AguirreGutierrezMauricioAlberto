import java.util.Random;
import java.util.*;
public class p{
    public static void main(String[] args) {
        String palabraSecreta = getPalabrasecreta();
        char [] palabraGuiones = getguiones(palabraSecreta);
        boolean juegoterminado = false;
        Scanner entrada = new Scanner(System.in);
        int intentos=5;
        

        do{System.out.println("Te quedan " +intentos+"intentos");
            System.out.println(palabraGuiones);
            System.out.println("introduce alguna letra");
            char letra = entrada.next().charAt(0);
            boolean algunaLetraacertada = false;
            for(int i =0; i<palabraSecreta.length(); i++){
                if(palabraSecreta.charAt(i) == letra){
                    palabraGuiones[i] = letra;
                    algunaLetraacertada = true;
                }
            }
            if(!algunaLetraacertada){System.out.println("No has acertado ninguna letra");
            --intentos;
            if(intentos==0){
        System.out.println("Has perdido porque ya no tienes intentos");
    juegoterminado = true;}}
    
            else{ boolean juegog = !quedag(palabraGuiones);
            if(juegog){System.out.println("has ganaddo el juego");
        juegoterminado = true;}}
        }while(!juegoterminado);
         entrada.close();
    }
    static String getPalabrasecreta(){ 
    String [] palabras = {"hipopotamo", "escuela", "dinosaurio"};
    Random r = new Random();
    int n = r.nextInt(palabras.length); 
    return palabras[n]; }

    static char[] getguiones(String palabra) {
    int nLetrasPalabraSecreta = palabra.length();
    char [] palabraGuiones = new char[nLetrasPalabraSecreta];
    for(int i=0; i<palabraGuiones.length; i++){
            palabraGuiones[i] = '_';
        }
     return palabraGuiones;
    }
        static boolean quedag(char[] array) {
        for(char l:array) {
            if(l=='_')return true;
        }
        return false;
        }
}