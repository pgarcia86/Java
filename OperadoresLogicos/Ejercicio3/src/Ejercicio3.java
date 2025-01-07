public class Ejercicio3 {
    public static void main(String[] args) throws Exception {

        boolean operation1 = 3 == 3 || 1 != 5;
        boolean operation2 = 5 != 0 || 9 <= 0;
        boolean operation3 = 7 > 10 || 6 >= 6;
        boolean operation4 = 2 > 5 || 4 < 1;

        System.out.println("3 es igual a 3 y 1 es distinto a 5? " + operation1);
        System.out.println("5 es distinto a cero y 9 es menor a cero? " + operation2);
        System.out.println("7 es mayor a 10 y 6 es mayor o igual a 6? " + operation3);
        System.out.println("2 es mayor a 5 y 4 es menor a 1? " + operation4);

    }
}
