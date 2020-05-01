package ua.asagayda.homework.task03.string.task04;
/*
Дано слово, состоящее четного числа букв. Вывести на экран его первую половину, не используя оператор цикла.
 */
public class Main {
    public static void main(String[] args) {
        FirstHalfWord fhw = new FirstHalfWord("Qwerty");
        System.out.println(fhw.showFirstHalf());
    }
}
