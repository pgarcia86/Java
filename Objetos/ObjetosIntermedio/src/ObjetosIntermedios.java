import java.util.ArrayList;

import empleado.Empleado;
import empleado.Gerente;
import estudiante.Estudiante;
import producto.Producto;

public class ObjetosIntermedios {
    public static void main(String[] args) throws Exception {

        double precioFinal = 0.0;
        ArrayList<Producto> productos = new ArrayList<Producto>();
        Estudiante estudiante = new Estudiante("Pablo Garcia", 38, 5.9, 4.7,8.0);
        Empleado empleado = new Empleado("Pablo Garcia", 1435);
        Empleado gerente = new Gerente("Pablo Garcia Barros", 1435, 800);

        productos.add(new Producto("Agua", 1.5, 50));
        productos.add(new Producto("Leche", 1.5, 40));
        productos.add(new Producto("Vino", 3, 30));
        productos.add(new Producto("Cerveza", 2.50, 20));
        productos.add(new Producto("Agua con gas", 2.5, 10));

        for(int i = 0; i < productos.size(); i++){
            precioFinal += productos.get(i).totalValor();
        }

        System.out.println("El valor total de todos los productos es: " + precioFinal);
        System.out.println(estudiante.toString());
        System.out.println(empleado.mostrarInfo());
        System.out.println(gerente.mostrarInfo());

    }
}
