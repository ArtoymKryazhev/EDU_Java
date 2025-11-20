package Lab_5_1;

public class Screwdriver extends Tool implements ElectricTool {
    @Override
    public void use() {
        System.out.println("Screwdriver");
    }

    @Override
    public void charge() {
        System.out.println("I am charging.");
    }
}
