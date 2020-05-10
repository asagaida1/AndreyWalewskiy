package lessons.inheritance;

public class Bmw extends Car {//is-a
    private String bmwModel;

    public Bmw(String name, int age, String bmwModel) {
        super(name, age);
        this.bmwModel = bmwModel;
    }

    public String getBmwModel() {
        printOne();
        return bmwModel;
    }

    public Bmw setBmwModel(String bmwModel) {
        this.bmwModel = bmwModel;
        return this;
    }
}
