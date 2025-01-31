import circulo.Circulo;
import rectangulo.Rectangulo;
import triangulo.Triangulo;

public class main {
    public static void main(String[] args) throws Exception {
        Triangulo triangulo = new Triangulo(10, 10, 10);
        System.out.println(triangulo.calcularArea());
        System.out.println(triangulo.calcularPerimetro());
        Circulo circulo = new Circulo(10);
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());
        Rectangulo rectangulo= new Rectangulo(10, 10);
        System.out.println(rectangulo.calcularArea());
        System.out.println(rectangulo.calcularPerimetro());
    }
}
