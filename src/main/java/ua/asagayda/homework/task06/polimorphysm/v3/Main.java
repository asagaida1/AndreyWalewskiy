package ua.asagayda.homework.task06.polimorphysm.v3;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Square square = new Square();

        circle.drawShape();
        square.drawShape();


        circle.drawCircle();
        square.drawSquare();

        draw(circle);
        draw(square);
    }

    public static void draw(Shape shape){
        shape.drawShape();
    }
}
