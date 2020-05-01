package ua.asagayda.homework.task03.string.task02;

/*
Соединить две строки след. вида: ("abc", "drf") результат: ("adbrcf"), ("ab", "drf") результат: ("adbrf"), ("abc", "dr") результат: ("adbrc")
 */
public class ConCatString {
    private String first;
    private String second;


    public ConCatString(String first, String second) {
        this.first = first;
        this.second = second;
    }


    String showResult() {
        StringBuilder sb = new StringBuilder();
        int maxLenth = Math.max(first.length(), second.length());

        for (int i = 0; i < maxLenth; i++) {
            if (first.length() > i) {
                sb.append(first.charAt(i));
            }
            if (second.length() > i) {
                sb.append(second.charAt(i));
            }
        }
        return sb.toString();
    }
}
