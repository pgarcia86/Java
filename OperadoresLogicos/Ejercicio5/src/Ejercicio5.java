public class Ejercicio5 {
    public static void main(String[] args) throws Exception {

        boolean a = true;
        boolean b = false;

        boolean op1 = a && b;
        boolean op2 = a || b;
        boolean op3 = !a;
        boolean op4 = a || (6 > 10);
        boolean op5 = ((4 <= 4) || false) && (!a);

        System.out.println("a y b son true? " + op1);
        System.out.println("a o b son true? " + op2);
        System.out.println("NOT a es true? " + op3);
        System.out.println("a es true o 6 es mayor a 10? " + op4);
        System.out.println("4 es mayor o igual a 4 o false? " + op5);

    }
}
