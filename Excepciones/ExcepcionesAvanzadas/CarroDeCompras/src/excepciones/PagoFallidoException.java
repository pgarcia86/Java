package excepciones;

public class PagoFallidoException extends Exception{

    String mensaje;

    public PagoFallidoException(String mensaje){
        super(mensaje);
    }
}
