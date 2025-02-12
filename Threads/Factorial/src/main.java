import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import factorial.Factorial;

public class main {
    public static void main(String[] args) throws Exception {

        Double resultado = 1d;
        
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Double> future = executor.submit(new Factorial(20000000));
        executor.shutdown();  
        try{
            resultado = future.get();   
            System.out.println("El factorial es: " + resultado);
        }catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }
    }
}
