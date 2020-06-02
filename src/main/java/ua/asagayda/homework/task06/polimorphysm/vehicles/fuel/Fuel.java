package ua.asagayda.homework.task06.polimorphysm.vehicles.fuel;

public interface Fuel {
    default void runDiesel() {
        System.out.println("Run on diesel");
    }

    default void runGasoline() {
        System.out.println("Run on gasoline");
    }

    default void runElectricity() {
        System.out.println("Run oin Electricity");
    }

}
