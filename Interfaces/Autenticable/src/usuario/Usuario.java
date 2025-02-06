package usuario;
import autenticable.Autenticable;

public abstract class Usuario implements Autenticable{
    String contrasenia;

    public Usuario(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }    
}
