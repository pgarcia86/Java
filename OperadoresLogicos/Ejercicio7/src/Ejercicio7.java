public class Ejercicio7 {
    public static void main(String[] args) throws Exception {

        boolean op1 = 5 - Math.pow(3,3) > 0 || 5 != 6 && !(7 >= 7);
        boolean op2 = 7 + 8/2 == 11 && (5 < 5 || 6 >= 6);

        System.out.println("5 - 3^3 es mayor a 0 o 5 es distinto a 6 y NOT 7 es mayor o igual a 7? " + op1);
        System.out.println("7 + 8/2 es igual a 11 y (5 es menor a 5 o 6 es mayor o igual a 6)? " + op2);
    }
}
