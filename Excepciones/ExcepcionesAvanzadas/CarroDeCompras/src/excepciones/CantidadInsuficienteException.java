package excepciones;

public class CantidadInsuficienteException extends Exception{

    String mensaje;

    public CantidadInsuficienteException(String mensaje){
        super(mensaje);
    }
}
