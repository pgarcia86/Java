import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws Exception {

        ArrayList<String> palabras = new ArrayList<String>();

        palabras.add("moratoria");
        palabras.add("moratoria");
        palabras.add("moratoria");
        palabras.add("moratoria");
        palabras.add("moratoria");
        palabras.add("moratoria");

        palabras.stream()
            .map(pal -> pal.toUpperCase())
            .forEach(System.out :: println);            
    }
}
