package lessons.inheritance;

public class Parent {
    private One one;//association
    private Two two;

    public Parent(One one, Two two) {
        this.one = one;//aggregation
        this.two = new Two();//composition
    }

    public void actionOne() {
        one.print();
    }

    public void actionTwo() {
        two.print();
    }
}

interface Printable {
    void print();
}

class NewParent {
    private Printable printable;

    public NewParent(Printable printable) {
        this.printable = printable;
    }

    public void action() {
        printable.print();
    }
}

class One implements Printable {
    public void print() {
        System.out.println("One");
    }
}

class Two implements Printable {
    public void print() {
        System.out.println("Two");
    }
}

class TestLowCouplingCode {
    public static void main(String[] args) {

        One one = new One();

        Two two = new Two();

        new NewParent(one);
    }
}
