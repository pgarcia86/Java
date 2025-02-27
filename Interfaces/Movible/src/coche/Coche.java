package coche;
import movible.Movible;

public class Coche implements Movible{

    private String marca;
    private String modelo;
    
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String mover() {
        return "El auto " + marca + " se esta moviendo";
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche [marca=" + marca + ", modelo=" + modelo + "]";
    }    
}
