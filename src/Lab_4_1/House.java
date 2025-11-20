package Lab_4_1;

import java.util.ArrayList;


class House {

    private ArrayList<Appliance> appliances;


    House() {
        this.appliances = new ArrayList<>();
    }

    void addAppliance(Appliance appliance) {
        this.appliances.add(appliance);
    }

    void turnOnAllAppliances() {
        for (Appliance appliance: appliances) {
            appliance.turnOn();
        }
    }
}
