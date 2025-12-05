package Lab_6_2;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle car  = factory.createVehicle("car");
        Vehicle boat = factory.createVehicle("boat");

        if (car != null) {
            car.move();
        }
        if (boat != null) {
            boat.move();
        }
    }
}
