package ua.asagayda.homework.task06.polimorphysm.vehicles;

import ua.asagayda.homework.task06.polimorphysm.vehicles.с.fuel.Diesel;
import ua.asagayda.homework.task06.polimorphysm.vehicles.с.fuel.Electricity;
import ua.asagayda.homework.task06.polimorphysm.vehicles.с.fuel.Fuelable;
import ua.asagayda.homework.task06.polimorphysm.vehicles.с.fuel.Gasoline;

import java.util.List;

public abstract class Cars extends Vehicles {
    private int wheels;
    private List<Fuelable> fuelables;
    private Fuelable fuelable;
    private Gasoline gasoline;
    private Object Gasoline;
//    private Cars cars;

    public Cars(int wheels, Fuelable fuelable) {
        this.wheels = wheels;
        this.fuelable = fuelable;

    }

//    public void addFuelable(Fuelable fuelable) {
//        fuelables.add(fuelable);
//    }

    public Fuelable getFuelable() {
        return fuelable;
    }

    public Cars setFuelable(Fuelable fuelable) {
        this.fuelable = fuelable;
        return this;
    }

    @Override
    public void fuel(Fuelable fuelable) {
        if(Cars.this.getFuelable() instanceof Fuelable){
            System.out.println("Fuel ok");
        }
        else{
            brake();
            System.out.println("Car is not used fuel gasoline");
            throw new IllegalArgumentException("Feul error");
        }
    }
    public void fuelGasoline() {
        if(Cars.this.getFuelable() instanceof Gasoline){
            System.out.println("Fuel gasoline ok");
        }
        else{
            brake();
            System.out.println("Car is not used fuel gasoline");
            throw new IllegalArgumentException("Feul error");
        }
    }
    public void fuelDiesel() {
        if(Cars.this.getFuelable() instanceof Diesel){
            System.out.println("Fuel diesel ok");
        }
        else{
            brake();
            System.out.println("Car is not used fuel diesel");
            throw new IllegalArgumentException("Feul error");
        }
    }
    public void fuelElectricity() {
        if(Cars.this.getFuelable() instanceof Electricity){
            System.out.println("Fuel electricity ok");
        }
        else{
            brake();
            System.out.println("Car is not used fuel electricity");
            throw new IllegalArgumentException("Feul error");
        }
    }


    @Override
    public String toString() {
        return "Cars{" +
                "wheels=" + wheels +
                ", fuelable=" + fuelable +
                "} " + super.toString();
    }
}
