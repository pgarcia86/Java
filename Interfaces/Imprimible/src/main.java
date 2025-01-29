import factura.Factura;
import libro.Libro;

public class main {
    public static void main(String[] args) throws Exception {
        Factura factura = new Factura("15-99287/4", 22);
        Libro libro = new Libro("Por quien doblan las campanas", "Ernst Hemingway");

        factura.imprimir();
        libro.imprimir();
    }
}
