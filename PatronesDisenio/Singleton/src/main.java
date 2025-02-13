import singleton.Singleton;

public class main {
    public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.getInstancia();
        singleton.showMessage();
    }
}
