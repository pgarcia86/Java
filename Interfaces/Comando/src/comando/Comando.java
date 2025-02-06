package comando;
import java.io.File;

public interface Comando {
    File ejecutar(String filePath, String comando);
}
