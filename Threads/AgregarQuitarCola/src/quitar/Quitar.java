package quitar;

import java.util.concurrent.BlockingQueue;

public class Quitar implements Runnable{

    private BlockingQueue<String> queue;

    public Quitar(BlockingQueue<String> queue){
        this.queue = queue;
    }


    @Override
    public void run() {
        while(true){
            try {
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }        
    }
}
