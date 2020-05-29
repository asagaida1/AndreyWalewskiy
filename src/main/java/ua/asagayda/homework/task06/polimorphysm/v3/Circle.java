package ua.asagayda.homework.task06.polimorphysm.v3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLDataException;

public class Circle extends Shape {

    public Circle() {
        super(ShapeType.CIRCLE);
    }

    @Override
    public void drawShape(){
        System.out.println("drawShape Circle");
    }

    @Override
    public void print() throws FileAlreadyExistsException, FileNotFoundException {
//        super.print();
    }
}
