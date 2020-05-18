package ua.asagayda.homework.task05.Inheritance.refactor2;

public class Book extends Reference {
    private int countOfpages;
    private String nameBook;

    public Book(Boolean isUpdated, int year, int volume, Author author, int countOfpages, String nameBook) {
        super(isUpdated, year, volume, author);
        this.countOfpages = countOfpages;
        this.nameBook = nameBook;
    }

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

}
