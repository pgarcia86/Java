import java.util.ArrayList;
import java.util.Collections;

import empleado.Empleado;

public class main {
    public static void main(String[] args) throws Exception {

        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(new Empleado("Sebastian Pissinis", 1700));
        empleados.add(new Empleado("Pablo Garcia", 1500));        
        empleados.add(new Empleado("Alex Andam", 2200));
        empleados.add(new Empleado("Ruben Gonzalez", 1500)); 
        empleados.add(new Empleado("Alan Velazco", 250)); 

        Collections.sort(empleados);
        System.out.println(empleados.toString());
    }
}
