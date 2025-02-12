package accesoVentanilla;

import java.util.concurrent.Semaphore;

public class AccesoVentanilla implements Runnable{

    private Semaphore semaforo;
    private int nroCliente;

    public AccesoVentanilla(int nroCliente, Semaphore semaforo){
        this.nroCliente = nroCliente;
        this.semaforo = semaforo;
    }

    @Override
    public void run() {

        try {
        System.out.println("El cliente " + nroCliente + " esta esperando en la fila");
            semaforo.acquire();
            System.out.println("El cliente " + nroCliente + " esta en la ventanilla");
            Thread.sleep(2000);
            System.out.println("El cliente " + nroCliente + " esta saliendo");
            semaforo.release();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
