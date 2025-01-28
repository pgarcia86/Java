package estudiante;
import java.util.ArrayList;

public class Estudiante {
    String name;
    ArrayList<Double> notas;

    public Estudiante(){

    }

    public double promedio(){
        double suma = 0;
        for(Double not : notas){
            suma += not;
        }
        return (suma/notas.size());
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Double> getNotas() {
        return notas;
    }
    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }    
}
