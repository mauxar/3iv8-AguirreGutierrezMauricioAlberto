//javac operaciones.java
public class operaciones {

    juno ju = new jupalabra();

    public static void main(String[] args){
        String  palabras = jupalabra();
        
        char []letras = palabras.toCharArray();
        char []letrasguion = new char[letras.length];

        for(int i=0; i<letras.length; i++){
           letrasguion[i]='_';

        }
    }

        
}