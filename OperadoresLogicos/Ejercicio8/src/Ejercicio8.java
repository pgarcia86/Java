public class Ejercicio8 {
    public static void main(String[] args) throws Exception {

        Integer a = 10;
        Integer b = 12;
        Integer c = 13;
        Integer d = 10;

        boolean op1 = ((a > b) || (a < c)) && ((a == c) || (a >= b));
        boolean op2 = ((a >= b) || (a < d)) && ((a >= d) && (c > d));
        boolean op3 = !(a == c) && (c > b);

        System.out.println("((a > b) || (a < c)) && ((a == c) || (a >= b)) " + op1);
        System.out.println("((a >= b) || (a < d)) && ((a >= d) && (c > d)) " + op2);
        System.out.println("!(a == c) && (c > b) " + op3);

    }
}
