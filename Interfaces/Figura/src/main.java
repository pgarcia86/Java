import figura.Circulo;
import figura.Cuadrado;

public class main {
    public static void main(String[] args) throws Exception {

        Cuadrado cuadrado = new Cuadrado(5, 15);
        Circulo circulo = new Circulo(22);

        System.out.println("Area cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perimetro cuadrado: " + cuadrado.calcularPerimetro());
        System.out.println("Area circulo: " + circulo.calcularArea());
        System.out.println("Perimetro circulo: " + circulo.calcularPerimetro());
    }
}
