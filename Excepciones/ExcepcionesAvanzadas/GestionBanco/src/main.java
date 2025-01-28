import java.util.Scanner;

import cuenta.Cuenta;
import cuenta.FondosInsuficientesException;
import cuenta.RetiroNegativoException;
public class main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = new Cuenta("Pablo Garcia", 1500);
        System.out.println("Ingrese la cantidad de dinero a retirar");
        double retiro = scanner.nextDouble();
        try {
            System.out.println(cuenta.retirar(retiro));
        } catch (FondosInsuficientesException fie) {
            System.out.println(fie.getMessage());
        } catch (RetiroNegativoException rne){
            System.out.println(rne.getMessage());
        } finally{
            System.out.println("Operacion terminada");
        }
        
        scanner.close();
    }
}
