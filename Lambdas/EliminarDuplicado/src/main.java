import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws Exception {
        
        List<String> palabras = new ArrayList<>();
        palabras.add("Java");
        palabras.add("Python");
        palabras.add("Java");
        palabras.add("C++");

        palabras.stream()
            .distinct()
            .forEach(System.out :: println);
    }
}