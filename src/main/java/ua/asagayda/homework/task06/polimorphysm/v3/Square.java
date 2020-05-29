package ua.asagayda.homework.task06.polimorphysm.v3;

public class Square extends Shape {

    public Square() {
        super(ShapeType.SQUARE);

    }

    @Override
    public void drawShape() {
        System.out.println("drawShape Square");
    }
}
