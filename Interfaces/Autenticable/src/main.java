import java.util.Scanner;

import cliente.Cliente;
import empleado.Empleado;
import usuario.Usuario;

public class main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Usuario empleado = new Empleado("PGB44pgb", "Ruben", 1750);
        Usuario cliente = new Cliente("RGT99rgt", "Miguel", 45);

        System.out.println("Ingrese la contraseña");
        System.out.println(empleado.autenticar("Ruben", scanner.nextLine()));

        System.out.println("Ingrese la contraseña");
        System.out.println(cliente.autenticar("Miguel", scanner.nextLine()));

    }
}
