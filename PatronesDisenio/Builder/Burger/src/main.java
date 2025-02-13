import burger.Burger;

public class main {
    public static void main(String[] args) throws Exception {
        Burger burger = Burger.builder()
            .setBreadType("brioche")
            .setMeat("Poco hecha")
            .setCheese("Gruyere")
            .setVegetables("Sin tomate")
            .builder();

        System.out.println(burger.toString());
    }
}
