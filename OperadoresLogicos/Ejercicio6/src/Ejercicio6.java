public class Ejercicio6 {
    public static void main(String[] args) throws Exception {

        boolean op1 = 1 >= 5 || 3 == 8 && 6 < 9 || 7 > 7;
        boolean op2 = 2 >= 2 || ! (4 < 12) && 5 != 6 && 8 <= 10;

        System.out.println("1 es mayor o igual a 5 o 3 es igual a 8 y 6 es menor a 9  7 es mayor a 7? " + op1);
        System.out.println("2 es mayor o igual a 2 o NOT 4 es menor a 12 y 5 es distinto a 6 y 8 es menor o igual a 10? " + op2);

    }
}
