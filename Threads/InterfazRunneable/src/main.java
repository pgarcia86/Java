import runneable.MiHilo;

public class main {
    public static void main(String[] args) throws Exception {
        
        MiHilo hilo = new MiHilo();
        Thread t = new Thread(hilo);
        System.out.println(t.getState());

        t.start();
    }
}
