package ua.asagayda.homework.task03.string.task04;

/*
Дано слово, состоящее четного числа букв. Вывести на экран его первую половину, не используя оператор цикла.
 */
public class FirstHalfWord {
    private String str;

    public FirstHalfWord(String str) {
        this.str = str;
    }

    String showFirstHalf() {
        return str.substring(0, str.length() / 2);
    }
}
