package ua.asagayda.homework.task06.polimorphysm.vehicles;

public class Trucks extends Vehicles{
    @Override
    public void Accelerate() {
        System.out.println("Trucks accelerate");
    }

    @Override
    public void Brake() {
        System.out.println("Trucks brake");
    }
}
