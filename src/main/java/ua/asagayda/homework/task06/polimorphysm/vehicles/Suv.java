package ua.asagayda.homework.task06.polimorphysm.vehicles;

public class Suv extends Cars {

    public Suv(int wheels, int wheels1) {
        super(wheels);
    }

    @Override
    public void accelerate() {
        System.out.println("Suv Accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Suv Brake");
    }
}
