/*
Crea una fábrica (VehicleFactory) que devuelva objetos de diferentes tipos de vehículos (Car, Bike) sin que el usuario necesite instanciarlos directamente.
*/

import bikeFactory.BikeFactory;
import carFactory.CarFactory;
import vehicle.Vehicle;
import vehicleFactory.VehicleFactory;

public class main {
    public static void main(String[] args) throws Exception {

        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.move();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.move();        
    }
}
