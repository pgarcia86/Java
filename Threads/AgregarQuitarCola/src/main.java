import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import insertar.Insertar;
import quitar.Quitar;

public class main {
    public static void main(String[] args) throws Exception {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);

        Insertar insert = new Insertar(queue);
        Quitar takeOff = new Quitar(queue);

        Thread insertThread = new Thread(insert);
        Thread takeOffThread = new Thread(takeOff);

        insertThread.start();
        takeOffThread.start();
    }
}
