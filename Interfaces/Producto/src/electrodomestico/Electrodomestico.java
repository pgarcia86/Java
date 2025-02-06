package electrodomestico;

import producto.Producto;

public class Electrodomestico implements Producto{
    private String nombre;
    private double precio;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Electrodomestico(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    @Override
    public double calcularDescuento(double porcentaje) {
        return (precio - (precio * 0.01 * porcentaje));
    }
}
