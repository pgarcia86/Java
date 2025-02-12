import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import tarea.Tarea;

public class main {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newFixedThreadPool(3);

        for(int i = 0; i <= 5; i++){
            exec.submit(new Tarea(i));
        }
        exec.shutdown();
    }
}
