/*
    Simular una carrera de ciclismo de 3 etapas con 100 ciclistas. Antes de que comience la siguiente etapa, todos los ciclistas deben terminar la etapa anterior.
    Calcular el ganador de cada etapa y de la carrera
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import carrera.Carrera;

public class main {
    public static void main(String[] args) throws Exception {
        
        int participantes = 100;
        ExecutorService executor = Executors.newCachedThreadPool();
        Carrera.iniciarCarrera(participantes);

        for(int i = 0; i < participantes; i++){
            Runnable runnable = new Carrera(i);
            executor.execute(runnable);
        }
        executor.shutdown();
        while (!executor.isTerminated());
        double[][] tiempos = Carrera.getTiempos();
    
        int idGanador = 0 , idGanadorEtapa1 = 0, idGanadorEtapa2 = 0, idGanadorEtapa3 = 0;
        double tiempoGanador = tiempos[0][3], tiempoGanadorEtapa1 = tiempos[0][0], tiempoGanadorEtapa2 = tiempos[0][1], tiempoGanadorEtapa3 = tiempos[0][2];

        for(int i = 0; i < tiempos.length; i++){
            if(tiempos[i][3] < tiempoGanador){
                tiempoGanador = tiempos[i][3];
                idGanador = i;
            }
            if(tiempos[i][2] < tiempoGanadorEtapa3){
                tiempoGanadorEtapa3 = tiempos[i][2];
                idGanadorEtapa3 = i;
            }
            if(tiempos[i][1] < tiempoGanadorEtapa2){
                tiempoGanadorEtapa2 = tiempos[i][1];
                idGanadorEtapa2 = i;
            }
            if(tiempos[i][0] < tiempoGanadorEtapa1){
                tiempoGanadorEtapa1 = tiempos[i][0];
                idGanadorEtapa1 = i;
            }
        }
        System.out.println("El ganador es: " + idGanador + " con un tiempo de " + tiempoGanador);
        System.out.println("El ganador de la etapa 1 es: " + idGanadorEtapa1 + " con un tiempo de " + tiempoGanadorEtapa1);
        System.out.println("El ganador de la etapa 2 es: " + idGanadorEtapa2 + " con un tiempo de " + tiempoGanadorEtapa2);
        System.out.println("El ganador de la etapa 3 es: " + idGanadorEtapa3 + " con un tiempo de " + tiempoGanadorEtapa3);
    }
}
