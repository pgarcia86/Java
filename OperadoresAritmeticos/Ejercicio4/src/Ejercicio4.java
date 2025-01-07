public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        
        double operation1 = 9+2-1+6;
        double operation2 = (9+(2-1))+6;
        double operation3 = 9+(2-(1+6));
        
        System.out.println("La operacion 9+2-1+6 es " + operation1);
        System.out.println("La operacion (9+(2-1))+6 es " + operation2);
        System.out.println("La operacion 9+(2-(1+6)) es " + operation3);
    }
}
