import java.util.ArrayList;

import empleado.Empleado;

public class main {
    public static void main(String[] args) throws Exception {

        ArrayList<Empleado> empleados = new ArrayList<Empleado>();

        empleados.add(new Empleado("Ruben", "Ventas"));
        empleados.add(new Empleado("Anibal", "IT"));
        empleados.add(new Empleado("Miguel", "Compras"));
        empleados.add(new Empleado("Juan Carlos", "RR HH"));
        empleados.add(new Empleado("Martin", "Ventas"));

        empleados.stream()
            .filter(emp -> emp.getDepartment().equalsIgnoreCase("Ventas"))
            .forEach(System.out :: println);
    }
}
