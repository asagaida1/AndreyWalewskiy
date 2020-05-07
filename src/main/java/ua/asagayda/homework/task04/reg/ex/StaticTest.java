package ua.asagayda.homework.task04.reg.ex;

public class StaticTest {
    private static int i;

    {
        i=0;
    }

    public StaticTest() {
        i++;
    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        StaticTest.i = i;
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println(StaticTest.getI());

    }
}
