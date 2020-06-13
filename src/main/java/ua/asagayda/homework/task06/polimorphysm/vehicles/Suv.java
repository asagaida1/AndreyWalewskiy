package ua.asagayda.homework.task06.polimorphysm.vehicles;

import ua.asagayda.homework.task06.polimorphysm.vehicles.с.fuel.Fuelable;

public class Suv extends Cars {

    public Suv(int wheels, Fuelable fuelable) {
        super(wheels, fuelable);
    }

    @Override
    public void accelerate() {
        System.out.println("Suv Accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Suv Brake");
    }


    @Override
    public void fuel(Fuelable fuelable) {

    }
}
