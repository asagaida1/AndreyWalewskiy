package ua.asagayda.homework.task06.polimorphysm.vehicles;

import ua.asagayda.homework.task06.polimorphysm.vehicles.с.fuel.Fuelable;

public class Trucks extends Vehicles{
    private int wheels;
    private Fuelable fuelable;

    public int getWheels() {
        return wheels;
    }

    public Trucks setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public Fuelable getFuelable() {
        return fuelable;
    }

    public Trucks setFuelable(Fuelable fuelable) {
        this.fuelable = fuelable;
        return this;
    }

    @Override
    public void accelerate() {
        System.out.println("Trucks accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Trucks brake");
    }

    @Override
    public void fuel(Fuelable fuelable) {

    }
}
