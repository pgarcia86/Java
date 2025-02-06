package cliente;
import usuario.Usuario;

public class Cliente extends Usuario{

    private String nombre;
    private double edad;

    public Cliente(String contrasenia, String nombre, double edad) {
        super(contrasenia);
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getEdad() {
        return edad;
    }
    public void setEdad(double edad) {
        this.edad = edad;
    }

    @Override
    public boolean autenticar(String usuario, String contrasenia) {
        if(super.getContrasenia().equals(contrasenia)){
            return true;
        }
        return false;
    }
}
