package contenedor;
import caja.Caja;
import transportable.Transportable;
import java.util.ArrayList;

public class Contenedor implements Transportable{

    private double peso;
    private double volumen;
    private ArrayList<Caja> cajas;

    public Contenedor(double peso, double volumen, ArrayList<Caja> cajas) {
        this.peso = peso;
        this.volumen = volumen;
        this.cajas = cajas;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getVolumen() {
        return volumen;
    }
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public double calcularCarga() {
        double pesoTotal = 0;
        for(Caja c : cajas){
            pesoTotal += c.calcularCarga();
        }
        return this.peso + pesoTotal;
    }
}
