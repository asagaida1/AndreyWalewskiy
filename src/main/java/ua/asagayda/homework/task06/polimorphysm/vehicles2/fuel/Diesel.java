package ua.asagayda.homework.task06.polimorphysm.vehicles2.fuel;

public class Diesel implements Fuelable {
    @Override
    public void fuel(Fuelable fuelable) {
        System.out.println("Fuel diesel");
    }

    @Override
    public String toString() {
        return "Diesel";
    }
}
