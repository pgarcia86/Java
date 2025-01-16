package coche;
public class Coche {

    String marca;
    String modelo;
    boolean encendido;
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
    public boolean isEncendido() {
        return encendido;
    }
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    public Coche(String marca, String modelo, boolean encendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendido = encendido;
    }

    public void arrancar(){
        this.encendido = true;
        System.out.println("El coche ha arrancado");
    }

    public void detener(){
        this.encendido = false;
        System.out.println("El coche se ha detenido");
    }

}
