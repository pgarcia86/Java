package producto;

public class Producto {
    String name;
    int qtty;
    double price;

    public Producto(String name, double price, int qtty){
        this.name = name;
        this.price = price;
        this.qtty = qtty;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQtty() {
        return qtty;
    }
    public void setQtty(int qtty) {
        this.qtty = qtty;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Nombre: " + name + " - Precio: " + price + " - Cantidad: " + qtty;
    }    
}
