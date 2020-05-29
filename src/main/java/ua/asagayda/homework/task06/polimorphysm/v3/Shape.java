package ua.asagayda.homework.task06.polimorphysm.v3;

import java.io.IOException;
import static java.lang.Math.*;

public abstract class Shape implements DrawShape {
    private ShapeType type;

    public Shape(ShapeType type) {
        this.type = type;
    }

    public void print() throws IOException {
        System.out.println(PI);
    }

    public static int workInt(int a) {
        return 5;
    }

    /*public static String workInt(int a) {
        return "";
    }*/

    public static void main(String[] args) {
//        workInt(new Integer(5));
    }

    //workInt(5)
}
