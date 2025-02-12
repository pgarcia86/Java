import contador.Contador;

public class main {
    public static void main(String[] args) throws Exception {
        
        Contador cont = new Contador();
        Thread t1 = new Thread(() -> cont.incrementar());
        Thread t2 = new Thread(() -> cont.incrementar());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(cont.getContador());
    }
}
