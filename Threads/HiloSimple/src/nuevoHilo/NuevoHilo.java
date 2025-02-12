package nuevoHilo;
public class NuevoHilo extends Thread{

    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Ejecutando: " + i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }
    }

}
