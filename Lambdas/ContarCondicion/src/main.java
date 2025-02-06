import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(15);
        numeros.add(5);
        numeros.add(20);
        numeros.add(2);
        numeros.add(9);
        numeros.add(40);
        numeros.add(6);
        numeros.add(10);
        numeros.add(25);
        numeros.add(11);

        numeros.stream()
            .filter(num -> num >= 10)
            .forEach(System.out :: println);
    }
}
