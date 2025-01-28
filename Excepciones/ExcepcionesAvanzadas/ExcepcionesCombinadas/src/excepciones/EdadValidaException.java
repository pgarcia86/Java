package excepciones;

public class EdadValidaException extends Exception{

    String mensaje;

    public EdadValidaException(String mensaje){
        super(mensaje);
    }

}
