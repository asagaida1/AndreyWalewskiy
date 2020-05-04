package lessons.inheritance;

public class Car implements Drivable {
    private String name;//has-a
    private int age;

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void drive() {

    }

    public String getName() {
        return name;
    }

    public Car setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Car setAge(int age) {
        this.age = age;
        return this;
    }
}

class Bmw extends Car {//is-a
    private String bmwModel;

    public Bmw(String name, int age, String bmwModel) {
        super(name, age);
        this.bmwModel = bmwModel;
    }

    public String getBmwModel() {
        return bmwModel;
    }

    public Bmw setBmwModel(String bmwModel) {
        this.bmwModel = bmwModel;
        return this;
    }
}

class TestInheritance {
    public static void main(String[] args) {
        Drivable drivable = new Bmw("Bmw", 5, "X5");

    }
}
