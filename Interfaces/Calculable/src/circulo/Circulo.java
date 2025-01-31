package circulo;
import calculable.Calculable;

public class Circulo implements Calculable{

    private double radio;
    private double PI = 3.14159;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public String calcularPerimetro() {
        return "El perimetro del circulo es: " + (2 * PI * radio);
    }
    
    @Override
    public String calcularArea() {
        return "El area del circulo es: " + (PI * Math.pow(radio, 2));        
    }
    
    public double getRadio() {
        return radio;
    }    
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }    
}
