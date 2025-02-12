import java.util.concurrent.Semaphore;

import accesoVentanilla.AccesoVentanilla;

public class main {
    public static void main(String[] args) throws Exception {
        
        Semaphore semaforo = new Semaphore(3);

        for(int i = 1; i <= 5; i++){
            Thread t = new Thread(new AccesoVentanilla(i, semaforo));
            t.start();
        }

    }
}
