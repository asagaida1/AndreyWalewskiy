package ua.asagayda.homework.task06.polimorphysm.vehicles2;

import ua.asagayda.homework.task06.polimorphysm.vehicles2.fuel.Fuelable;

public class HybridCar extends Cars {

    public HybridCar(int wheels, Fuelable fuelable, Fuelable fuelable2) {
        super(wheels, fuelable, fuelable2);
    }

    @Override
    public void accelerate() {
        System.out.println("Hybrid car accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Hybrid Car brake");

    }

    @Override
    public void fuel(Fuelable fuelable) {

    }

    @Override
    public String toString() {
        return "HybridCar{} " + super.toString();
    }
}
