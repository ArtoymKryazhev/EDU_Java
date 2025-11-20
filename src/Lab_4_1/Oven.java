package Lab_4_1;

public class Oven extends Appliance{

    Oven(String model) {
        super(model);
    }

    @Override
    void turnOn() {
        System.out.println("Refrigerator is turned on");
    }
}
