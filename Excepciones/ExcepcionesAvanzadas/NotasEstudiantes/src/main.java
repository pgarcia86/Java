import java.util.ArrayList;

import estudiante.Estudiante;
import validaciones.Validacion;

public class main {
    public static void main(String[] args) throws Exception {

        Estudiante estudiante = new Estudiante();
        Validacion validar = new Validacion();

        estudiante.setName(validar.nombre());
        ArrayList<Double> notas = new ArrayList<Double>();

        do{
            notas.add(validar.nota());
        }while(notas.getLast() != -1);
        notas.removeLast();
        estudiante.setNotas(notas);

        System.out.println(estudiante.promedio());

    }
}
