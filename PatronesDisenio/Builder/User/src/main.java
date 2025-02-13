import user.User;

public class main {
    public static void main(String[] args) throws Exception {
        User user = User.builder()
            .setName("Pablo Garcia")
            .setAge(39)
            .setEmail("pgarciabarros86@gmail.com")
            .builder();

        System.out.println(user.toString());
    }
}
