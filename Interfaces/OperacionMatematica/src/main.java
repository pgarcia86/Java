import sumar.Sumar;
import restar.Restar;
import multiplicar.Multiplicar;
import dividir.Dividir;

public class main {
    public static void main(String[] args) throws Exception {

        Sumar sumar = new Sumar(5, 8);
        Restar restar = new Restar(8,22);
        Multiplicar multiplicar = new Multiplicar(44, 18);
        Dividir dividir = new Dividir(22, 0);
        System.out.println(sumar.sumar());
        System.out.println(restar.restar());
        System.out.println(multiplicar.multiplicar());
        try{
            System.out.println(dividir.dividir());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
