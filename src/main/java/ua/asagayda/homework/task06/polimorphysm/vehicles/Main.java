package ua.asagayda.homework.task06.polimorphysm.vehicles;

import ua.asagayda.homework.task06.polimorphysm.vehicles.с.fuel.Diesel;
import ua.asagayda.homework.task06.polimorphysm.vehicles.с.fuel.Fuelable;
import ua.asagayda.homework.task06.polimorphysm.vehicles.с.fuel.Gasoline;

public class Main {


    private Diesel diesel;

    public static void main(String[] args) {
        CompactCar compactCar = new CompactCar(4,new Gasoline());
        System.out.println(compactCar.toString());
        System.out.println(compactCar.getFuelable());
        compactCar.fuelGasoline();
//        compactCar.fuelDiesel();

//        compactCar.fuel(new Diesel());
    }
}
