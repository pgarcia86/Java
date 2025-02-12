package hiloJoin;

public class HiloJoin extends Thread{

    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Ejecutando Join: " + i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }
    }

}
