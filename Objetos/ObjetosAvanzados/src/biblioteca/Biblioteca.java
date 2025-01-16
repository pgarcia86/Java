package biblioteca;
import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Libro> libros;

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Biblioteca [libros=" + libros + "]";
    }
    
    public void mostrarLibros(){        
        for(int i = 0; i < libros.size(); i++){
            System.out.println(libros.get(i).toString());
        }
    }
}
