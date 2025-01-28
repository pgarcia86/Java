package exception;

public class NotaInvalidaException extends Exception{
    String mensaje;

    public NotaInvalidaException(String mensaje){
        super(mensaje);
    }
}
