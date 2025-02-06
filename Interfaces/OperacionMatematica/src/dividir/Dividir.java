package dividir;
import dividirPorCeroException.DividirPorCeroException;
import operacionMatematica.OperacionMatematica;

public class Dividir implements OperacionMatematica{

    private double num1;
    private double num2;    

    public Dividir(double num1, double num2) {
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multiplicar'");
    }

    @Override
    public double dividir() throws DividirPorCeroException{
        if(num2 == 0){
            throw new DividirPorCeroException("No se puede dividir por cero");
        }else{
            return num1/num2;
        }
    }

}
