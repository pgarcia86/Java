import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(44);
        numeros.add(9);
        numeros.add(3);
        numeros.add(6);
        numeros.add(1);

        numeros.stream()
            .filter(num -> num % 3 == 0)
            .findFirst()
            .ifPresent(System.out :: println);
    }
}
