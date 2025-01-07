public class Ejercicio6 {
    public static void main(String[] args) throws Exception {

        boolean operation1 = 4 < 12;
        boolean operation2 = 1 >= 5;
        boolean operation3 = 5 - Math.pow(3,2) > 0;
        boolean operation4 = 5 != 6;
        boolean operation5 = 3 == 8;

        System.out.println("4 es menor a 12? " + operation1);
        System.out.println("1 es mayor a 5? " + operation2);
        System.out.println("5 - (3^2) > 0 es mayor a 0? " + operation3);
        System.out.println("5 es distinto a 6? " + operation4);
        System.out.println("3 es igual a 8? " + operation5);

    }
}
