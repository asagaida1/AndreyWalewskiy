package ua.asagayda.homework.task06.polimorphysm.vehicles.с.fuel;

public class Electricity implements Fuelable {
    @Override
    public void fuel(Fuelable fuelable) {
        System.out.println("Fuel electricity");
    }

    @Override
    public String toString() {
        return "Electricity";
    }
}
