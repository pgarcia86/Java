package singleton;

public class Singleton {
    private static Singleton instancia;

    private Singleton(){

    }

    public static Singleton getInstancia(){
        if(instancia == null){
            instancia = new Singleton();
        }
        return instancia;
    }

    public void showMessage(){
        System.out.println("Este es el mensaje");
    }
}
