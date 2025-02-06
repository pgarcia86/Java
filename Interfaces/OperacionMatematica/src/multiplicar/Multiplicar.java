package multiplicar;
import operacionMatematica.OperacionMatematica;

public class Multiplicar implements OperacionMatematica{

    private double num1;
    private double num2;    

    public Multiplicar(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public double sumar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sumar'");
    }

    @Override
    public double restar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'restar'");
    }

    @Override
    public double multiplicar() {
        return num1 * num2;
    }

    @Override
    public double dividir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dividir'");
    }

}
