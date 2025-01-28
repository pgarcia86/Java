package exception;

public class NombreValidoException extends Exception{

    String mensaje;

    public NombreValidoException(String mensaje){
        super(mensaje);
    }

}
