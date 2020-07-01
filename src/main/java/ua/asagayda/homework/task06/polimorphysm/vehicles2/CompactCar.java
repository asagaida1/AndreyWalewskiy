package ua.asagayda.homework.task06.polimorphysm.vehicles2;

import ua.asagayda.homework.task06.polimorphysm.vehicles2.fuel.Fuelable;
import ua.asagayda.homework.task06.polimorphysm.vehicles2.fuel.Gasoline;


public class CompactCar extends Cars implements Fuelable {

    public CompactCar(int wheels, Fuelable fuelable) {
        super(wheels, fuelable);
    }

    @Override
    public void accelerate() {
        System.out.println("CompactCar Accelerate");
    }

    @Override
    public void brake() {
        System.out.println("CompactCar Brake");
    }

    //    @Override
//    public void addFuelable(Fuelable fuel) {
//        /*
//        if (!(fuel instanceof Diesel) || !(fuel instanceof Gasoline) || !(fuel instanceof Electricity)) {
//            throw new IllegalArgumentException("Incorrect fuel");
//        }
//
//         */
//        super.addFuelable(fuel);
//    }

    @Override
    public String toString() {
        return "CompactCar{} " + super.toString();
    }

    @Override
    public void fuel(Fuelable fuelable) {
    }

}

