package ua.asagayda.homework.task06.polimorphysm.vehicles2;

import ua.asagayda.homework.task06.polimorphysm.vehicles2.fuel.Diesel;
import ua.asagayda.homework.task06.polimorphysm.vehicles2.fuel.Fuelable;
import ua.asagayda.homework.task06.polimorphysm.vehicles2.fuel.Gasoline;

import java.util.List;

public class Main {


    private Diesel diesel;

    public static void main(String[] args) {
        CompactCar compactCar = new CompactCar(4,new Gasoline());
        System.out.println("compactCar.toString() = " + compactCar.toString());
        System.out.println("compactCar.getFuelable() = " + compactCar.getFuelable());
        System.out.println("compactCar.getWheels() = " + compactCar.getWheels());
        compactCar.accelerate();
        System.out.println("compactCar.getFuelablesList() = " + compactCar.getFuelablesList());
        compactCar.fuel(compactCar);
        System.out.println("========================");

        compactCar.refueling(compactCar.getFuelable()); // Получилось заправить машину.
        compactCar.refueling(Gasoline);                 // как получить Неправильную заправку?

    }
}
