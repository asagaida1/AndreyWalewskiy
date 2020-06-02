package ua.asagayda.homework.task06.polimorphysm.vehicles.fuel;

public interface Electricity extends Fuel{
    default public void run(){
        System.out.println("Use electricity");
    }

}
