import java.util.ArrayList;

import caja.Caja;
import contenedor.Contenedor;

public class main {
    public static void main(String[] args) throws Exception {
        Caja caja = new Caja(150, 220);
        ArrayList<Caja> cajas = new ArrayList<Caja>();
        cajas.add(new Caja(31, 225));
        cajas.add(new Caja(25, 220));
        cajas.add(new Caja(221, 53));
        cajas.add(new Caja(5, 755));
        Contenedor contenedor = new Contenedor(1750, 5570, cajas);

        System.out.println(caja.calcularCarga());
        System.out.println(contenedor.calcularCarga());
    }
}
