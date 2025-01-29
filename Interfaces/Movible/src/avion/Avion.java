package avion;
import movible.Movible;

public class Avion implements Movible{

    private String marca;
    private int capacidad;

    public Avion(String marca, int capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
    }

    @Override
    public String mover() {
        return "El avion " + marca + " se esta moviendo";
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    @Override
    public String toString() {
        return "Avion [marca=" + marca + ", capacidad=" + capacidad + "]";
    }
}
