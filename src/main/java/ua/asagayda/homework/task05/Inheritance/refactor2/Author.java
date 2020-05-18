package ua.asagayda.homework.task05.Inheritance.refactor2;

public abstract class Author {
    String author1;
    String author2;
    String author3;
    String author4;

    public Author() {
    }

    public Author(String author1) {
        this.author1 = author1;
    }

    public Author(String author1, String author2) {
        this.author1 = author1;
        this.author2 = author2;
    }

    public Author(String author1, String author2, String author3) {
        this.author1 = author1;
        this.author2 = author2;
        this.author3 = author3;
    }

    public Author(String author1, String author2, String author3, String author4) {
        this.author1 = author1;
        this.author2 = author2;
        this.author3 = author3;
        this.author4 = author4;
    }

    public String getAuthor1() {
        return author1;
    }

    public Author setAuthor1(String author1) {
        this.author1 = author1;
        return this;
    }

    public String getAuthor2() {
        return author2;
    }

    public Author setAuthor2(String author2) {
        this.author2 = author2;
        return this;
    }

    public String getAuthor3() {
        return author3;
    }

    public Author setAuthor3(String author3) {
        this.author3 = author3;
        return this;
    }

    public String getAuthor4() {
        return author4;
    }

    public Author setAuthor4(String author4) {
        this.author4 = author4;
        return this;
    }


}
