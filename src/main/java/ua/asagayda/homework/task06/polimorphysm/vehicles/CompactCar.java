package ua.asagayda.homework.task06.polimorphysm.vehicles;

import ua.asagayda.homework.task06.polimorphysm.vehicles.с.fuel.Diesel;
import ua.asagayda.homework.task06.polimorphysm.vehicles.с.fuel.Electricity;
import ua.asagayda.homework.task06.polimorphysm.vehicles.с.fuel.Fuelable;

public class CompactCar extends Cars {
    public CompactCar(int wheels) {
        super(wheels);
    }

    @Override
    public void accelerate() {
        System.out.println("CompactCar Accelerate");
    }

    @Override
    public void brake() {
        System.out.println("CompactCar Brake");
    }

    @Override
    public void addFuelable(Fuelable fuel) {
        if (!(fuel instanceof Diesel) && !(fuel instanceof Electricity)) {
            throw new IllegalArgumentException("Incorrect fuel");
        }
        super.addFuelable(fuel);
    }
}
