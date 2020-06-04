package ua.asagayda.homework.task06.polimorphysm.vehicles;

import ua.asagayda.homework.task06.polimorphysm.vehicles.с.fuel.Fuelable;

import java.util.ArrayList;
import java.util.List;

public abstract class Cars extends Vehicles {
    private int wheels;
    private List<Fuelable> fuelables;

    public Cars(int wheels) {
        this.wheels = wheels;
        fuelables = new ArrayList<>();
    }

    public void addFuelable(Fuelable fuelable) {
        fuelables.add(fuelable);
    }
}
