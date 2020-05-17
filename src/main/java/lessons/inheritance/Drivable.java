package lessons.inheritance;

public interface Drivable {

    void drive();

    default void print() {
    }

    static void fun() {
    }
}

/*
* private - visibilty only inside class
* package - private - visibilty only inside package
* protected - visibilty only inside package + subclass
* public - visibilty anywhere

 * */

