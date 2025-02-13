package userFactories;

import guest.Guest;
import user.User;

public class GuestFactorie extends UserFactories{

    @Override
    public User createUser() {
        return new Guest();
    }

}
