import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        String rutaArchivo = "log.txt";
        System.out.println("Ingrese un numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = scanner.nextInt();

        try{
            System.out.println("El resultado de la division es: " + num1/num2);
        } catch(ArithmeticException ae){
            try(FileWriter writer = new FileWriter(rutaArchivo, true)){
                writer.write("No se puede hacer la operacion - Fecha: " + LocalDate.now() + " - Hora: " + LocalTime.now() + " \n");
                System.out.println("Se escribio correctamente en el archivo log.txt");
            } catch(IOException e){
                System.out.println("No se puede escribir en el archivo");
            } finally{
                System.out.println("Programa terminado");
            }
        }
        scanner.close();
    }
}
