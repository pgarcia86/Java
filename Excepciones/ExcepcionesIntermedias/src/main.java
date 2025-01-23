import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import calculadora.Calculadora;

public class main {
    public static void main(String[] args) throws Exception {
        
        Calculadora calculadora = new Calculadora();
        calculadora.iniciar();

        Scanner scannerRutaArchivo = new Scanner(System.in);
        System.out.println("Ingresa la ruta del archivo que quiere leer");
        String rutaArchivo = scannerRutaArchivo.nextLine();
        
        try{
            Scanner scannerFile = new Scanner(new File(rutaArchivo));
            while (scannerFile.hasNextLine()){
                System.out.println(scannerFile.nextLine());
            }
            scannerFile.close();
        } catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Programa terminado");
        }
        scannerRutaArchivo.close();
    }
}
