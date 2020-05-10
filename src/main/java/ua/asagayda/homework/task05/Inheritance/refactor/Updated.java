package ua.asagayda.homework.task05.Inheritance.refactor;

public class Updated extends Author{
    Boolean isUpdater;
    int year;
    int volume;

    public Updated(String author1, Boolean isUpdater, int year, int volume) {
        super(author1);
        this.isUpdater = isUpdater;
        this.year = year;
        this.volume = volume;
    }

    public Updated(String author1, String author2, Boolean isUpdater, int year, int volume) {
        super(author1, author2);
        this.isUpdater = isUpdater;
        this.year = year;
        this.volume = volume;
    }

    public Updated(String author1, String author2, String author3, Boolean isUpdater, int year, int volume) {
        super(author1, author2, author3);
        this.isUpdater = isUpdater;
        this.year = year;
        this.volume = volume;
    }

    public Updated(String author1, String author2, String author3, String author4, Boolean isUpdater, int year, int volume) {
        super(author1, author2, author3, author4);
        this.isUpdater = isUpdater;
        this.year = year;
        this.volume = volume;
    }
}
