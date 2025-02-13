package guest;
import user.User;

public class Guest implements User{

    @Override
    public void getPermissions() {
       System.out.println("El invitado sólo puede ver datos");
    }
}
