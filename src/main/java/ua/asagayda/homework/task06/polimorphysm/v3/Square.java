package ua.asagayda.homework.task06.polimorphysm.v3;

public class Square extends Shape implements DrawSquare {
    @Override
    public void drawShape() {
        System.out.println("drawShape Square");

    }

    public void drawSquare(){
        System.out.println("drawSquare");
    }
}
