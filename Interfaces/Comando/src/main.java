import comandoAbrir.ComandoAbrir;
import comandoEscribir.ComandoEscribir;
import comandoLeer.ComandoLeer;
import comandoSobreescribir.ComandoSobreescribir;

public class main {
    public static void main(String[] args) throws Exception {

        ComandoAbrir abrir = new ComandoAbrir();
        ComandoEscribir escribir = new ComandoEscribir();
        ComandoLeer leer = new ComandoLeer();
        ComandoSobreescribir sobreescribir = new ComandoSobreescribir();

        abrir.ejecutar("log.txt", null);
        escribir.ejecutar("log.txt", "CTRL + Z");
        leer.ejecutar("log.txt", null);
        sobreescribir.ejecutar("log.txt", null);
    }
}
