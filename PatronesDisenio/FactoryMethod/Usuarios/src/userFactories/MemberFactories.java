package userFactories;
import member.Member;
import user.User;

public class MemberFactories extends UserFactories{

    @Override
    public User createUser() {
        return new Member();   
    }
}
