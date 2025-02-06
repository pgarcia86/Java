import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add("Pablo");
        nombres.add("Ruben");
        nombres.add("Augusto");
        nombres.add("Anibal");
        nombres.add("Lucas");
        nombres.add("Aroldo");
        nombres.add("Alex");
        nombres.add("Alejandro");

        nombres.stream()
                .filter(nom -> nom.startsWith("A"))
                .forEach(System.out :: println);
    }
}
