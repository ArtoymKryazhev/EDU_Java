package Lab_4_1;

class WashingMachine extends Appliance {

    WashingMachine(String model) {
        super(model);
    }

    @Override
    void turnOn() {
        System.out.println("Washing machine turned on");
    }
}
