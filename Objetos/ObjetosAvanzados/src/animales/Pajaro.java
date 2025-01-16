package animales;
public class Pajaro extends Animal{

    public Pajaro(String nombre, int edad){
        super(nombre, edad);
    }

    public void sonido(){
        System.out.println("PioPio, soy un pajaro");
    }
}
