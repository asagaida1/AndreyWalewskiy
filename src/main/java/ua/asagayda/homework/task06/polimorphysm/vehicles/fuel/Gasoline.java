package ua.asagayda.homework.task06.polimorphysm.vehicles.fuel;

public interface Gasoline extends Fuel {
    default public void run() {
        System.out.println("Use gasoline");
    }
}
