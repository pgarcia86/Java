import java.util.ArrayList;

import animales.Animal;
import animales.Gato;
import animales.Pajaro;
import animales.Perro;
import biblioteca.Biblioteca;
import biblioteca.Libro;
import coche.Coche;

public class ObjetosAvanzados {
    public static void main(String[] args) throws Exception {

        Coche coche = new Coche("Ford", "Mondeo", false);

        ArrayList<Animal> animales = new ArrayList<Animal>();
        animales.add(new Perro("Lola", 15));
        animales.add(new Gato("Vegetta", 3));
        animales.add(new Pajaro("Cocoroco", 12));

        ArrayList<Libro> libros = new ArrayList<Libro>();
        libros.add(new Libro("Por quien doblan las campanas", "Ernst Hemingway", 1955));
        libros.add(new Libro("La montania magica", "Thomas Mann", 1939));
        libros.add(new Libro("El ingenioso idalgo Don Quijote de La Mancha", "Miguel de Cervantez Saavedra", 1604));

        Biblioteca biblioteca = new Biblioteca(libros);

        for(int i = 0; i < animales.size(); i++){
            animales.get(i).sonido();
        }

        coche.arrancar();
        coche.detener();

        biblioteca.mostrarLibros();
    }
}
