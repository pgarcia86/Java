package carrera;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Carrera implements Runnable{

    private int id;
    private static CyclicBarrier barrier;
    private static double[][] tiempos;
    private Random random = new Random(System.nanoTime());

    public Carrera(int id){
        this.id = id;
    }
    
    public static void iniciarCarrera(int participantes){
        barrier = new CyclicBarrier(participantes);
        tiempos = new double[participantes][4];
    }


    @Override
    public void run() {

        etapa(1);
        etapa(2);
        etapa(3);

        tiempos[id][3] = tiempos[id][0] + tiempos[id][1] + tiempos[id][2];
    }

    public void etapa(int nroEtapa){
        double inicio = System.nanoTime();

        try{
            Thread.sleep(random.nextInt(100) + 100);
        }catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }

        double total = System.nanoTime() - inicio;
        tiempos[id][nroEtapa - 1] = total;

        try {
            barrier.await();
            barrier.reset();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static double[][] getTiempos(){
        return tiempos;
    }
}
