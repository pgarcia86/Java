import hiloJoin.HiloJoin;
import nuevoHilo.NuevoHilo;

public class main {
    public static void main(String[] args) throws Exception {
        NuevoHilo nuevoHilo = new NuevoHilo();
        HiloJoin hiloJoin = new HiloJoin();
        nuevoHilo.start();
        System.out.println("ACA");
        hiloJoin.run();
        
        try {
            hiloJoin.join(); // Espera a que el hilo termine
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hilo terminado, continuando ejecución.");
    }
}
