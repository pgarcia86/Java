package productos;

public class Producto {
    String name;
    double price;
    int cant;

    public Producto(String name, double price, int cant){
        this.name = name;
        this.price = price;
        this.cant = cant;
    }

    public Producto(String name, int cant){
        this.name = name;
        this.cant = cant;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getCant() {
        return cant;
    }
    public void setCant(int cant) {
        this.cant = cant;
    }    
}
