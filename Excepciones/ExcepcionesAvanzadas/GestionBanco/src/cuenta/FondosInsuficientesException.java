package cuenta;

public class FondosInsuficientesException extends Exception {
    String mensaje;
    
    public FondosInsuficientesException(String mensaje){
        super(mensaje);
    }
}
