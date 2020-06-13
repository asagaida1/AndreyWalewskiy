package ua.asagayda.homework.task06.polimorphysm.vehicles;

import ua.asagayda.homework.task06.polimorphysm.vehicles.с.fuel.Fuelable;

public abstract class Vehicles implements Fuelable {

    public abstract void accelerate();

    public abstract void brake();

}
