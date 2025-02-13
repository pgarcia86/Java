import foodOrder.FoodOrder;
public class main {
    public static void main(String[] args) throws Exception {
        FoodOrder foodOrder = FoodOrder.builder()
            .setMainCourse("Sushi")
            .setSide("Giosas")
            .setDrink("Coca-Cola")
            .setDessert("Tiramisu")
            .builder();

        System.out.println(foodOrder.toString());

        FoodOrder foodOrder2 = FoodOrder.builder()
            .setMainCourse("Arroz Yakisoba")
            .setDrink("Agua con gas")
            .builder();

        System.out.println(foodOrder2.toString());
    }
}
