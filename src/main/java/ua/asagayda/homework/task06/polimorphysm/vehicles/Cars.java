package ua.asagayda.homework.task06.polimorphysm.vehicles;

public abstract class Cars extends Vehicles {

    @Override
    public void Accelerate() {
        System.out.println("Cars accelerate");
    }

    @Override
    public void Brake() {
        System.out.println("Cars brake");
    }
}
