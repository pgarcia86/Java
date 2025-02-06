package dividirPorCeroException;

public class DividirPorCeroException extends Exception{

    private String mensaje;

    public DividirPorCeroException(String mensaje){
        super(mensaje);
    }
}
