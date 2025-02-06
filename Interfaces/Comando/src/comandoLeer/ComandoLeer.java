package comandoLeer;
import comando.Comando;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ComandoLeer implements Comando{

    @Override
    public File ejecutar(String filePath, String comando) {

        try(BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)))){
            String linea;
            while((linea = reader.readLine()) != null){
                System.out.println(linea);
            }
        }catch(IOException ioe){
            System.out.println("No se pudo leer el archivo");
        }

        return null;
    }
}
