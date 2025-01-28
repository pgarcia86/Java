import productos.Producto;
import venta.Venta;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws Exception {

        ArrayList<Producto> inventario = new ArrayList<Producto>();
        inventario.add(new Producto("Agua", 2.5, 4));
        inventario.add(new Producto("Coca Cola", 2.5, 3));
        inventario.add(new Producto("Cerveza", 2.5, 10));
        inventario.add(new Producto("Vino", 2.5, 8));

        ArrayList<Producto> prodVenta = new ArrayList<Producto>();
        prodVenta.add(new Producto("Agua", 2));
        prodVenta.add(new Producto("Whisky", 4));

        Venta venta = new Venta(prodVenta, 22);
        try{
            venta.hacerVenta(inventario);
            System.out.println("Se pudo hacer la venta");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
