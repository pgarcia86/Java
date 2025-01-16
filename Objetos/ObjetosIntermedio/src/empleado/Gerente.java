package empleado;
public class Gerente extends Empleado{

    double bono;

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }

    public String mostrarInfo() {
        return "Gerente [nombre=" + nombre + ", salario=" + salario + ", bono=" + bono  + "]";
    }
}
