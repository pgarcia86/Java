package cuenta;

public class RetiroNegativoException extends Exception{
    String mensaje;

    public RetiroNegativoException(String mensaje){
        super(mensaje);
    }
}
