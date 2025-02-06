package ropa;

import producto.Producto;

public class Ropa implements Producto{

    private String tipo;
    private double precio;

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Ropa(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }


    @Override
    public double calcularDescuento(double porcentaje) {
        return (precio - (precio * 0.01 * porcentaje));    
    }
}
