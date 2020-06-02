package ua.asagayda.homework.task06.polimorphysm.vehicles;


import ua.asagayda.homework.task06.polimorphysm.vehicles.fuel.Fuel;

public abstract class Vehicles implements Fuel {

    private int wheels;

    public abstract void Accelerate();

    public abstract void Brake();

    public int getWheels() {
        return wheels;
    }

    public Vehicles setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }
}
