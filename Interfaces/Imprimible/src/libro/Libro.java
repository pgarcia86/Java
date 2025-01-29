package libro;
import imprimible.Imprimible;

public class Libro implements Imprimible{
    private String name;
    private String author;

    public Libro(String name, String author){
        this.name = name;
        this.author = author;
    }

    @Override
    public void imprimir() {
        System.out.println("El nombre del libro es: " + name + " y su autor es: " + author);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Libro [name=" + name + ", author=" + author + "]";
    }
}
