package ua.asagayda.homework.task06.polimorphysm.vehicles2;

import ua.asagayda.homework.task06.polimorphysm.vehicles2.fuel.Fuelable;

public class RacingCar extends Cars {
    private int wheels;
    Fuelable fuelable;

    public RacingCar(int wheels, Fuelable fuelable, int wheels1, Fuelable fuelable1) {
        super(wheels, fuelable);
        this.wheels = wheels1;
        this.fuelable = fuelable1;
    }

    public int getWheels() {
        return wheels;
    }

    public RacingCar setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public Fuelable getFuelable() {
        return fuelable;
    }

    public RacingCar setFuelable(Fuelable fuelable) {
        this.fuelable = fuelable;
        return this;
    }

    @Override
    public void accelerate() {
        System.out.println("RacingCar Accelerate");
    }

    @Override
    public void brake() {
        System.out.println("RacingCar Brake");
    }

    @Override
    public void fuel(Fuelable fuelable) {

    }


}
