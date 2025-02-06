import java.util.ArrayList;
import java.util.List;

import empleado.Empleado;

public class main {
    public static void main(String[] args) throws Exception {

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan", 2500.50));
        empleados.add(new Empleado("Ana", 3200.75));
        empleados.add(new Empleado("Luis", 1500.25));
        empleados.add(new Empleado("Carlos", 2700.80));

        double salProm = empleados.stream()
                            .mapToDouble(Empleado :: getSalary)
                            .sum()/empleados.size();
        System.out.println(salProm);
    }
}
