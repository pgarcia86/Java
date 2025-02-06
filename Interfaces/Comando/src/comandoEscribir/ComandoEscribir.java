package comandoEscribir;
import comando.Comando;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ComandoEscribir implements Comando{

    @Override
    public File ejecutar(String filePath, String comando) {

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(new File(filePath), true))){
            writer.write(comando + "\n");
            System.out.println("Se escribio en el archivo");
        }catch(IOException ioe){
            System.out.println("No se puede escribir en el archivo");
        }
        return null;
    }
}
