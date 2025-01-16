package animales;
public class Perro extends Animal {

    public Perro(String nombre, int edad){
        super(nombre, edad);
    }

    public void sonido(){
        System.out.println("Guau, soy un perro");
    }
}
