package ua.asagayda.homework.task05.Inheritance.refactor;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Ivanov", false, 2016, 5000, 500, "Йа Дартаньян");
        Article article = new Article("Petrov", true, 2020, 200000, 1, 2, "Что нужно знать про Короновирус");
        System.out.println(book.toString());
        System.out.println(article.toString());
    }
}
