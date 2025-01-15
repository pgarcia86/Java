public class Rectangulo {

    double base;
    double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }    

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area(){
        return base * altura;
    }

    public double perimetro(){
        return 2 * (base + altura);
    }
}
