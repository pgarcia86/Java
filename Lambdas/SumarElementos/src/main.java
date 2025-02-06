import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws Exception {
        
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);

        double suma = numeros.stream()
                        .mapToInt(Integer :: intValue)
                        .sum();

        double suma2 = numeros.stream()
                        .mapToInt(Integer :: intValue)
                        .reduce(0, (a,b) -> a + b);
        
        System.out.println(suma);                        
        System.out.println(suma2);
    }
}
