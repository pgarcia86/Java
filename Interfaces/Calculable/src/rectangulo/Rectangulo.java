package rectangulo;

import calculable.Calculable;

public class Rectangulo implements Calculable{

    private double lado1;
    private double lado2;
    
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public String calcularPerimetro() {
        return "El perimetro del rectangulo es: " + (2*lado1 + 2*lado2);
    }

    @Override
    public String calcularArea() {
        return "El area del rectangulo es: " + (lado1 * lado2);
    }
    
    public double getLado1() {
        return lado1;
    }    
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }    
    public double getLado2() {
        return lado2;
    }    
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    @Override
    public String toString() {
        return "Rectangulo [lado1=" + lado1 + ", lado2=" + lado2 + "]";
    }

}
