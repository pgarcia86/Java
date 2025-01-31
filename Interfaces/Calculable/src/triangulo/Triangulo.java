package triangulo;

import calculable.Calculable;

public class Triangulo implements Calculable{
    
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    @Override
    public String calcularPerimetro() {
        return "El perimetro del triangulo es: " + (lado1 + lado2 + lado3);
    }
    
    @Override
    public String calcularArea() {
        double sp = ((lado1 + lado2 + lado3)/2);
        return "El area del triangulo es: " + Math.sqrt(sp*(sp-lado1)*(sp-lado2)*(sp-lado3));
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
    public double getLado3() {
        return lado3;
    }    
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    @Override
    public String toString() {
        return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "]";
    }
}
