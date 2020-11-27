//  javac principal.java
// javac operaciones.java
import javax.swing.JOptionPane;
public class principal{

    public static void main(String[] args){
        String selec;
        selec =JOptionPane.showInputDialog("3IV8_SANJUAN_ROA_IKERDEJESHUA\nSeleccione la opcion deseada:\n1) Sueldo\n2) Proovedores\n3) Biblioteca");
            Integer.parseInt(selec);
          operaciones obj = new operaciones();
        obj.instancia();
    }
}