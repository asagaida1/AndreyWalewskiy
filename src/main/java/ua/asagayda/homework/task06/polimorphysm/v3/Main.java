package ua.asagayda.homework.task06.polimorphysm.v3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Shape shape = new Shape();


        circle.drawShape();
        square.drawShape();

        shape.drawShape();

        circle.drawCircle();
        square.drawSquare();

    }
}
