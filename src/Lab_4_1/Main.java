package Lab_4_1;

public class Main {
    public static void main(String[] args) {
        Oven oven = new Oven("Oven");
        Refrigerator ref = new Refrigerator("Refrigerator");
        WashingMachine washingMachine = new WashingMachine("WashingMachine");

        House house = new House();

        house.addAppliance(oven);
        house.addAppliance(ref);
        house.addAppliance(washingMachine);

        house.turnOnAllAppliances();
    }
}
