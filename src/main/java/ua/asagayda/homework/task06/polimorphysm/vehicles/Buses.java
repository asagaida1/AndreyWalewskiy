package ua.asagayda.homework.task06.polimorphysm.vehicles;

public class Buses extends Vehicles{
    int wheels;

    @Override
    public void Accelerate() {
        System.out.println("Buses accelerate");
    }

    @Override
    public void Brake() {
        System.out.println("Buses brake");
    }



}
