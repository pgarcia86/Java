import user.User;
import userFactories.AdministratorFactorie;
import userFactories.GuestFactorie;
import userFactories.MemberFactories;
import userFactories.UserFactories;

public class main {
    public static void main(String[] args) throws Exception {
        UserFactories memberFactorie = new MemberFactories();
        UserFactories guestFactorie = new GuestFactorie();
        UserFactories adminFactories = new AdministratorFactorie();

        User guest = guestFactorie.createUser();
        User member = memberFactorie.createUser();
        User admin = adminFactories.createUser();

        guest.getPermissions();
        member.getPermissions();
        admin.getPermissions();
    }
}
