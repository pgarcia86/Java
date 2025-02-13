package userFactories;

import administrator.Administrator;
import user.User;

public class AdministratorFactorie extends UserFactories{

    @Override
    public User createUser() {
        return new Administrator();
    }
}
