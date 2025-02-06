package comandoSobreescribir;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import comando.Comando;

public class ComandoSobreescribir implements Comando{

    @Override
    public File ejecutar(String filePath, String comando) {

        try{
            FileWriter writer = new FileWriter(filePath);
            writer.close();
        }catch(IOException ioe){
            System.out.println("No se pudo borrar el contenido del archivo");
        }
        return null;
    }
}
