package comandoAbrir;
import comando.Comando;
import java.io.File;

public class ComandoAbrir implements Comando{

    @Override
    public File ejecutar(String filePath, String comando) {

        File file = new File(filePath);

        if(file.exists()){
            return file;
        }
        else{
            System.out.println("No existe el archivo");
            return null;
        }
    }
}
