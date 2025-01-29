import avion.Avion;
import coche.Coche;

public class main {
    public static void main(String[] args) throws Exception {
        
        Avion avion = new Avion("Boeing", 157);
        Coche coche = new Coche("Ford", "Mondeo");

        System.out.println(avion.mover());
        System.out.println(coche.mover());
    }
}
