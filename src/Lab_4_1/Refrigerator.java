package Lab_4_1;

public class Refrigerator extends Appliance {

    Refrigerator(String model) {
        super(model);
    }

    void turnOff() {
        System.out.println("Refrigerator is turned off");
    }

}
