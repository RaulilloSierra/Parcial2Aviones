
package parcial2program2;

public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        Aeronave1 av1 = new Aeronave1();
        av1.IngresarDatos();
        av1.ImprimirDatos();
        
        Aeronave2 av2 = new Aeronave2();
        av2.IngresarDatos();
        av2.ImprimirDatos();
        
        av1.Despegar();
        av1.Aterrizar();
        av2.Despegar();
        av2.Aterrizar();
    }
    
}
