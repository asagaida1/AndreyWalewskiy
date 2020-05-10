package ua.asagayda.homework.task05.Inheritance.refactor;

public class Book extends Updated {
    int countOfPages;
    String BookName;

    public Book(String author1, Boolean isUpdater, int year, int volume, int countOfPages, String bookName) {
        super(author1, isUpdater, year, volume);
        this.countOfPages = countOfPages;
        BookName = bookName;
    }

    public Book(String author1, String author2, Boolean isUpdater, int year, int volume, int countOfPages, String bookName) {
        super(author1, author2, isUpdater, year, volume);
        this.countOfPages = countOfPages;
        BookName = bookName;
    }

    public Book(String author1, String author2, String author3, Boolean isUpdater, int year, int volume, int countOfPages, String bookName) {
        super(author1, author2, author3, isUpdater, year, volume);
        this.countOfPages = countOfPages;
        BookName = bookName;
    }

    public Book(String author1, String author2, String author3, String author4, Boolean isUpdater, int year, int volume, int countOfPages, String bookName) {
        super(author1, author2, author3, author4, isUpdater, year, volume);
        this.countOfPages = countOfPages;
        BookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "countOfPages=" + countOfPages +
                ", BookName='" + BookName + '\'' +
                ", isUpdater=" + isUpdater +
                ", year=" + year +
                ", volume=" + volume +
                ", author1='" + author1 + '\'' +
                ", author2='" + author2 + '\'' +
                ", author3='" + author3 + '\'' +
                ", author4='" + author4 + '\'' +
                '}';
    }
}
