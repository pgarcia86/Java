package cuenta;

public class Cuenta {

    String titular;
    double saldo;

    public Cuenta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String retirar(double retiro) throws FondosInsuficientesException, RetiroNegativoException {
        if(retiro > saldo){
            throw new FondosInsuficientesException("No se puede retirar mas dinero del que tienes en la cuenta");
        } else if(retiro < 0){
            throw new RetiroNegativoException("No se puede hacer un retiro negativo de dinero");
        }
        this.saldo -= retiro;
        return "Has retirado " + retiro + " - El saldo nuevo es: " + (saldo - retiro);
    }

}
