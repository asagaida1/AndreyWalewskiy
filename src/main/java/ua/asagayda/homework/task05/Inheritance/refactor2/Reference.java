package ua.asagayda.homework.task05.Inheritance.refactor2;

public abstract class Reference {
    private Boolean isUpdated;
    private int year;
    private int volume;
    private Author author;

    public Reference(Boolean isUpdated, int year, int volume, Author author) {
        this.isUpdated = isUpdated;
        this.year = year;
        this.volume = volume;
        this.author = author;
    }
}
