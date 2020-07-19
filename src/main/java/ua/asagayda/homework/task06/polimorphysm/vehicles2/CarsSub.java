package ua.asagayda.homework.task06.polimorphysm.vehicles2;

import ua.asagayda.homework.task06.polimorphysm.vehicles2.fuel.Fuelable;

public class CarsSub extends Cars{
    public CarsSub(int wheels, Fuelable fuelable) {
        super(wheels, fuelable);
    }

    @Override
    public void accelerate() {
        System.out.println("Cars run");
    }

    @Override
    public void brake() {
        System.out.println("Cars brake");

    }

    @Override
    public void fuel(Fuelable fuelable) {

    }
}
