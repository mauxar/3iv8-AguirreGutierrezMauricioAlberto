
import javax.swing.JOptionPane;

public class principal{
  
    operaciones zo = new operaciones();
    operacionesprovedor ty = new operacionesprovedor();
    biblioteca cl = new biblioteca();

 
    //public static void main(String[] args) {
      
       
        int opcionr;
        String texto;
      
        principal menupr = new principal();
        
        do{

            menupr.menuP();

            texto = JOptionPane.showInputDialog("Si desea volver al menu principal presione 1 \n De lo contrario pulse 0");
            opcionr = Integer.parseInt(texto);
        }while(opcionr == 1);
    }
 
    public void menuP(){
   
        int opcionm=0;
        String selec;
        try{
            selec = JOptionPane.showInputDialog("Seleccione la opcion deseada:\n1) Sueldo\n2) Proovedores\n3) Biblioteca");
            opcionm = Integer.parseInt(selec);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ingresa solo valores enteros\nError: "+e.getMessage());
        }
        switch (opcionm) {
            case 1:
                zo.MenuS();
                break;
            case 2:
                ty.MenuPR();
                break;
            case 3:
                cl.Libros();
                break;
            default:
                break; }}}