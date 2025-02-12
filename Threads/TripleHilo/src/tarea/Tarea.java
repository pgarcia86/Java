package tarea;

public class Tarea implements Runnable{

    private final int NROTAREA;

    public Tarea(int nroTarea){
        this.NROTAREA = nroTarea;
    }

    @Override
    public void run() {

        for(int i = 0; i < 5; i++){
            System.out.println("Tarea " + NROTAREA + ": " + i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){
                Thread.currentThread().interrupt();
                System.out.println("Tarea " + NROTAREA + " interrumpida");
            }
        }
    }    
}
