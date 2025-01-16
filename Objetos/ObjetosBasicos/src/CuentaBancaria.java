public class CuentaBancaria {
    
    String titular;
    double saldo;

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double cantidad){
        this.saldo += cantidad;
        System.out.println("Se han ingresado " + cantidad + "€. El nuevo saldo es: " + this.saldo + "€");
    }

    public void retirar(double cantidad){
        this.saldo -= cantidad;
        System.out.println("Se han retirado " + cantidad + "€. El nuevo saldo es: " + this.saldo + "€");
    }

    public void mostrarSaldo(){
        System.out.println("El saldo actual es: " + this.saldo);
    }

    public String toString(){
        return "El titular de la cuenta es: " + this.titular +
            " - El saldo es: " + this.saldo + "€";
    }
    
}
