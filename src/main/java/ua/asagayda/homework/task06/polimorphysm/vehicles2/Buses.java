package ua.asagayda.homework.task06.polimorphysm.vehicles2;

import ua.asagayda.homework.task06.polimorphysm.vehicles2.fuel.Fuelable;

public class Buses extends Vehicles {
    private int wheels;
    private Fuelable fuelable;

    public Fuelable getFuelable() {
        return fuelable;
    }

    public Buses setFuelable(Fuelable fuelable) {
        this.fuelable = fuelable;
        return this;
    }

    public int getWheels() {
        return wheels;
    }

    public Buses setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    @Override
    public void accelerate() {
        System.out.println("Buses accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Buses brake");
    }

    @Override
    public void fuel(Fuelable fuelable) {

    }
}
