package contador;

public class Contador {

    private int contador;

    public Contador(){

    }    
    public int getContador() {
        return contador;
    }
    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public synchronized void incrementar(){
        for(int i = 0; i < 1000; i++){
            contador++;
        }
    }    
}
