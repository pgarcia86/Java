package excepciones;

public class CarritoVacioException extends Exception{
    String mensaje;

    public CarritoVacioException(String mensaje){
        super(mensaje);
    }
}
