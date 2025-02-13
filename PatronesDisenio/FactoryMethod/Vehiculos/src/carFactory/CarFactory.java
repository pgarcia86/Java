package carFactory;
import car.Car;
import vehicle.Vehicle;
import vehicleFactory.VehicleFactory;

public class CarFactory extends VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
