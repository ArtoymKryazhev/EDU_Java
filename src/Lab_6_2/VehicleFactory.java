package Lab_6_2;

public class VehicleFactory {

    public Vehicle createVehicle(String type) {
        if (type == null) {
            return null;
        }

        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "boat":
                return new Boat();
            default:
                System.out.println("Неизвестный тип транспорта: " + type);
                return null;
        }
    }

}
