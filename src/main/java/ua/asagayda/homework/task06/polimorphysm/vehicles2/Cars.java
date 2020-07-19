package ua.asagayda.homework.task06.polimorphysm.vehicles2;

import ua.asagayda.homework.task06.polimorphysm.vehicles2.fuel.Diesel;
import ua.asagayda.homework.task06.polimorphysm.vehicles2.fuel.Electricity;
import ua.asagayda.homework.task06.polimorphysm.vehicles2.fuel.Fuelable;

import java.util.ArrayList;
import java.util.List;

public abstract class Cars extends Vehicles{
    private int wheels;
    private Fuelable fuelable;
    private List <Fuelable> fuelablesList;


    public Cars(int wheels, Fuelable fuelable) {
        this.wheels = wheels;
        this.fuelable = fuelable;
        fuelablesList = new ArrayList<>();
        fuelablesList.add(fuelable);
    }

    public int getWheels() {
        return wheels;
    }

    public Cars setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public Fuelable getFuelable() {
        return fuelable;
    }

    public Cars setFuelable(Fuelable fuelable) {
        this.fuelable = fuelable;
        return this;
    }

    public List<Fuelable> getFuelablesList() {
        return fuelablesList;
    }

    public Cars setFuelablesList(List<Fuelable> fuelablesList) {
        this.fuelablesList = fuelablesList;
        return this;
    }
    public Cars addFuelablesList(List<Fuelable> fuelablesList) {
        this.fuelablesList = fuelablesList;
        return this;
    }

    public void refueling (Fuelable fuelable){
        if (fuelablesList.contains(fuelable)) {
            System.out.println("Car is correct fuel");
        }
        else{
            System.out.println("Car is not correct fuel. Car is broken");
        }
    }
}
