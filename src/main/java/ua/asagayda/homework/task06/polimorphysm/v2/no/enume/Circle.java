package ua.asagayda.homework.task06.polimorphysm.v2.no.enume;

public class Circle extends Shape implements Drowing {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void drawShape() {
        System.out.println("drawShape: Circle");

    }

    @Override
    public void drow() {
        double area = radius*radius*Math.PI;
        System.out.println("area = " + area);
    }
}
