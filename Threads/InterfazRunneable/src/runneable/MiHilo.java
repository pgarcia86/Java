package runneable;

public class MiHilo implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i <= 5; i++){
            System.out.println("Hilo en ejecucion");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
