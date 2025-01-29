import java.util.HashSet;
import java.util.Set;

import validacion.Validacion;

public class main {
    public static void main(String[] args) throws Exception {
        Set<String> palabrasUnicas = new HashSet<String>();
        Validacion validar = new Validacion();

        palabrasUnicas.add("palabra");
        palabrasUnicas.add("palabra");
        palabrasUnicas.add("unicas");

        palabrasUnicas.addAll(validar.setText());
        System.out.println(palabrasUnicas);
    }
}
