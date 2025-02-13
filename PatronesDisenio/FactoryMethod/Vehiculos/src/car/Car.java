package car;
import vehicle.Vehicle;

public class Car implements Vehicle{

    @Override
    public void move() {
        System.out.println("El auto se esta moviendo");
    }

}
