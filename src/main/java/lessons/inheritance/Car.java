package lessons.inheritance;

public abstract class Car implements Drivable {
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

    abstract void printOne();
}
