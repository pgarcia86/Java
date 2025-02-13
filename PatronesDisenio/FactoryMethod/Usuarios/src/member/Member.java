package member;
import user.User;

public class Member implements User{

    @Override
    public void getPermissions() {
        System.out.println("El miembro puede ver y editar algunos datos");
    }    
}
