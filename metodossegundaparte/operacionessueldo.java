import javax.swing.JOptionPane;

public class operacionessueldo{ 

    private int id, opp, oprs, sueldonn, hed=50, hen=60, sueldoe=5000;
    private double totalg, sueldon, sueldoes=8000, isr=1280, inf=1600, sgmed=800;
    private String noe, texto;
    //Inicio donde se ingresaran los datos principales
    public void MenuS(){

        do{
            totalg=isr+inf+sgmed;
            try{
                id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID de empleado:"));
                noe=JOptionPane.showInputDialog("Ingrese su nombre:");
                opp=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido\nIngrese el numero de acuerdo a su puesto:\n1) Empleado\n2) Empleado Supervisor"));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ingresa solo valores enteros a exepcion del nombre\nError: "+e.getMessage());
            }

            switch (opp) {
                case 1:
                    SueldoE(); 
                    break;

                case 2:
                    SueldoES();
                    break;
            
                default:
                    break;
            }
            oprs=Integer.parseInt(JOptionPane.showInputDialog("Si desea repetir el programa de para calcular su sueldo presione 1 \n si quiere regresar al menu principal presione 0"));
        }while(oprs==1);
    }
    // clase para calcular sueldo de emplesdo normal
    public void SueldoE(){
        hed = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus horas extras diarias de esta quincena: "));
        if(hed<0|hed>36){
            JOptionPane.showMessageDialog(null,"La cantidad ingresada no es valida intente de nuevo");
            texto = JOptionPane.showInputDialog("Ingrese la cantidad de de horas extras diurnas de esta quincena: ");
            hed = Integer.parseInt(texto);
        }
        hen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus horas extras nocturnas de esta quincena: "));
        if(hen<0|hen>36){
            JOptionPane.showMessageDialog(null,"La cantidad ingresada no es valida intente de nuevo");
            texto = JOptionPane.showInputDialog("Ingrese la cantidad de de horas extras diurnas de esta quincena: ");
            hed = Integer.parseInt(texto);
        }
        sueldonn = sueldoe + hed + hen;
        FinalSE();
    }
    //clase para calcular sueldo de supervisores
    public void SueldoES(){
        sueldonn = (int)sueldoes - (int)totalg;
        FinalSES();
    }

    public void FinalSE(){
        JOptionPane.showMessageDialog(null,noe+" con ID "+id+" tu saldo es de"+sueldonn+"$ esta quincena");
    }

    public void FinalSES(){
        JOptionPane.showMessageDialog(null,noe+" con ID "+id+" tu saldo es de"+sueldonn+"$ esta quincena");
    }
}