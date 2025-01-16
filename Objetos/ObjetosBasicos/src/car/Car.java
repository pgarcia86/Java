package car;
public class Car {
    String marca;
    String modelo;
    int anio;
    String color;

    public Car(String marca, String modelo, int anio, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }


    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        
        return "La marca del auto es: " + this.marca +
            " - El modelo del auto es: " + this.modelo + 
            " - El año del auto es: " + this.anio + 
            " - El color del auto es: " + this.color;
    }
}
