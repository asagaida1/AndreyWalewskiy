package ua.asagayda.homework.task05.Inheritance.refactor2;

public class Book extends Author {
    int countOfpages;
    String nameBook;
    Boolean isUpdated;
    int year;
    int volume;

    public int getCountOfpages() {
        return countOfpages;
    }

    public Book setCountOfpages(int countOfpages) {
        this.countOfpages = countOfpages;
        return this;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Book setNameBook(String nameBook) {
        this.nameBook = nameBook;
        return this;
    }

    public Boolean getUpdated() {
        return isUpdated;
    }

    public Book setUpdated(Boolean updated) {
        isUpdated = updated;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Book setYear(int year) {
        this.year = year;
        return this;
    }

    public int getVolume() {
        return volume;
    }

    public Book setVolume(int volume) {
        this.volume = volume;
        return this;
    }
}
