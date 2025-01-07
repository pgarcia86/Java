public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        
        boolean op1 = 1 != 5;
        boolean op2 = 9 <= 0;
        boolean op3 = 6 >= 6;
        boolean op4 = 2 > 5;

        System.out.println("1 es distinto a 5 con operador NOT: " + !op1);
        System.out.println("9 es menor o igual a 0 con operador NOT: " + !op2);
        System.out.println("6 es mayor o igual a 6 con operador NOT: " + !op3);
        System.out.println("2 es mayor a 5 con operador NOT: " + !op4);
    }
}
