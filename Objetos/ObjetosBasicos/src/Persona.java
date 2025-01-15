public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void saludar(){
        System.out.println("Hola! mi nombre es: " + this.nombre +
            " y tengo " + this.edad);
    }

    public String toString(){
        return "El nombre de la persona es: " + this.nombre +
            " - La edad de la persona es: " + this.edad;
    }

    
}
