package administrator;
import user.User;

public class Administrator implements User{

    @Override
    public void getPermissions() {
        System.out.println("El administrador tiene full acceso");
    }
}
