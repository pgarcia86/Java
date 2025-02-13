package bike;
import vehicle.Vehicle;

public class Bike implements Vehicle{

    @Override
    public void move() {
        System.out.println("La bicicleta se esta moviendo");
    }



}
