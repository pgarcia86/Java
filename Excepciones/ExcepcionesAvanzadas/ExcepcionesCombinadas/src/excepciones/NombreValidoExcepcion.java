package excepciones;

public class NombreValidoExcepcion extends Exception{
    String mensaje;

    public NombreValidoExcepcion(String mensaje){
        super(mensaje);
    }
}
