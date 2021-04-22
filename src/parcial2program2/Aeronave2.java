package parcial2program2;
import javax.swing.JOptionPane;
public class Aeronave2 implements MovAvion{
    String Tipo, Modelo, Color;
    int Asientos, Velocidad;

    @Override
    public void Aterrizar() {
        int op = 0;
        while (op!=1&&op!=2){
            String ind;
            ind = JOptionPane.showInputDialog("La aeronave 2 va a aterrizar\n"
                + "1. Si\n"
                + "2. No");
            op = Integer.parseInt(ind);
            
            if (op==1){
                JOptionPane.showMessageDialog(null, "La aeronave 2 aterrizo");
            }else if(op==2){
                JOptionPane.showMessageDialog(null, "La aeronave 2 sigue en vuelo");
            
            }else{
                JOptionPane.showMessageDialog(null, "Opcion no reconocida");
            }
            
        }
    }

    @Override
    public void Despegar() {
        int op = 0;
        while (op!=1&&op!=2){
            String ind;
            ind = JOptionPane.showInputDialog("La aeronave 2 va a despegar\n"
                + "1. Si\n"
                + "2. No");
            op = Integer.parseInt(ind);
            
            if (op==1){
                JOptionPane.showMessageDialog(null, "La aeronave 2 despego");
            }else if(op==2){
                JOptionPane.showMessageDialog(null, "La aeronave 2 sigue en tierra");
            
            }else{
                JOptionPane.showMessageDialog(null, "Opcion no reconocida");
            }
            
        }
    }
    public void IngresarDatos (){
        JOptionPane.showMessageDialog(null, "DATOS DE LA AERONAVE 2");
        Tipo = JOptionPane.showInputDialog("Cual es el tipo de aeronave");
        Modelo = JOptionPane.showInputDialog("Cual es el modelo de la aeronave");
        Asientos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de asientos"));
        Color = JOptionPane.showInputDialog("Color de la aeronave");
        Velocidad = Integer.parseInt(JOptionPane.showInputDialog("Velocidad maxima de la aeronave en km/h"));
    }
    public void ImprimirDatos(){
        
        JOptionPane.showMessageDialog(null, "AERONAVE 2\n"+"\n"+"Tipo de Aeronave: "+Tipo+
                "\nModelo: "+Modelo+
                "\nNumero de asientos: "+Asientos+
                "\nColor: "+Color+
                "\nVelocidad máxima: "+Velocidad+" km/h");
        
    }
    
}