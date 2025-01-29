package factura;
import imprimible.Imprimible;

public class Factura implements Imprimible{

    private String nroFactura;
    private double importe;
    
    public Factura(String nroFactura, double importe){
        this.nroFactura = nroFactura;
        this.importe = importe;
    }

    @Override
    public void imprimir() {
        System.out.println("El numero de factura es: " + nroFactura + " y su importe es: " + importe);
    }

    public String getNroFactura() {
        return nroFactura;
    }
    public void setNroFactura(String nroFactura) {
        this.nroFactura = nroFactura;
    }
    public double getImporte() {
        return importe;
    }
    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Factura [nroFactura=" + nroFactura + ", importe=" + importe + "]";
    }
}
