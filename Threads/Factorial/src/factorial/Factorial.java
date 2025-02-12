package factorial;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Double>{

    int fact;
    double resultado = 1;

    public Factorial(int fact){
        this.fact = fact;
    }

    @Override
    public Double call() throws Exception {

        for(int i = this.fact; i > 0; i--){
            resultado *= i;
        }
        return resultado;
    }
}
