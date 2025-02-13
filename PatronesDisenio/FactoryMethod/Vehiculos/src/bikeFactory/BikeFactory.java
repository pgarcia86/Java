package bikeFactory;

import bike.Bike;
import vehicle.Vehicle;
import vehicleFactory.VehicleFactory;

public class BikeFactory extends VehicleFactory{
    public Vehicle createVehicle(){
        return new Bike();
    }
}
