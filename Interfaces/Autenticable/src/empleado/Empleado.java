package empleado;
import usuario.Usuario;

public class Empleado extends Usuario{

    private String nombre;
    private double salario;    


    public Empleado(String contrasenia, String nombre, double salario) {
        super(contrasenia);
        this.nombre = nombre;
        this.salario = salario;
    }

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
    
    public String getContrasenia() {
        return super.getContrasenia();
    }

    public void setContrasenia(String contrasenia) {
        super.setContrasenia(contrasenia);
    }

    @Override
    public boolean autenticar(String usuario, String contrasenia) {
        if(super.getContrasenia().equals(contrasenia)){
            return true;
        }
        return false;
    }
}
