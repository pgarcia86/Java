package empleado;

public class Empleado implements Comparable<Empleado>{

    private String nombre;
    private double salario;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }    

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", salario=" + salario + "]";
    }
    @Override
    public int compareTo(Empleado otro) {
        return Double.compare(this.salario, otro.salario);
    }
}
