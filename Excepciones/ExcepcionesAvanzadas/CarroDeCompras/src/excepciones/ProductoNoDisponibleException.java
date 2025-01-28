package excepciones;

public class ProductoNoDisponibleException extends Exception{
    String mensaje;

    public ProductoNoDisponibleException(String mensaje){
        super(mensaje);
    }
}
