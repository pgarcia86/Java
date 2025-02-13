import car.Car;

public class main {
    public static void main(String[] args) throws Exception {
        Car car = Car.builder()
            .setEngine("V8")
            .setColor("Rojo")
            .setTransmission("Manual")
            .setSunroof(null)
            .builder();

        System.out.println(car.toString());
    }
}
