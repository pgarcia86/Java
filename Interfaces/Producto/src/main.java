import electrodomestico.Electrodomestico;
import ropa.Ropa;

public class main {
    public static void main(String[] args) throws Exception {
        
        Electrodomestico electrodomestico = new Electrodomestico("Television", 150);
        Ropa ropa = new Ropa("Chaqueta", 70);

        System.out.println(electrodomestico.calcularDescuento(15));
        System.out.println(ropa.calcularDescuento(15));
    }
}
