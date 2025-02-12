package insertar;

import java.util.concurrent.BlockingQueue;

public class Insertar implements Runnable{

    private BlockingQueue<String> queue;

    public Insertar(BlockingQueue<String> queue){
        this.queue = queue;
    }

    @Override
    public void run() {        
        while(true){
            try {
                queue.put("" + System.nanoTime());
                sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void sleep(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
