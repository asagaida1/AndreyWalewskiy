package ua.asagayda.homework.task03.string.task02;
/*
Соединить две строки след. вида: ("abc", "drf") результат: ("adbrcf"), ("ab", "drf") результат: ("adbrf"), ("abc", "dr") результат: ("adbrc")
 */
public class Main {
    public static void main(String[] args) {
        ConCatString ccs = new ConCatString("abc", "drf");
        System.out.println(ccs.showResult());

        ConCatString ccs2 = new ConCatString("ab", "drf");
        System.out.println(ccs2.showResult());

        ConCatString ccs3 = new ConCatString("abc", "dr");
        System.out.println(ccs3.showResult());
    }
}
