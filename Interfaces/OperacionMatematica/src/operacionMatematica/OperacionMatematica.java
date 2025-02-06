package operacionMatematica;
import dividirPorCeroException.DividirPorCeroException;

public interface OperacionMatematica {
    double sumar();
    double restar();
    double multiplicar();
    double dividir() throws DividirPorCeroException;
}
