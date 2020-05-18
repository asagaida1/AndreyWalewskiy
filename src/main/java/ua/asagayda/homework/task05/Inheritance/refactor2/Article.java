package ua.asagayda.homework.task05.Inheritance.refactor2;

import java.util.Objects;

public class Article extends Reference  {
    private int startPage;
    private int endPage;
    private String nameArticle;

    public Article(Boolean isUpdated, int year, int volume, Author author,
                   int startPage, int endPage, String nameArticle) {
        super(isUpdated, year, volume, author);
        this.startPage = startPage;
        this.endPage = endPage;
        this.nameArticle = nameArticle;
    }

    public int getStartPage() {
        return startPage;
    }

    public Article setStartPage(int startPage) {
        this.startPage = startPage;
        return this;
    }

    public int getEndPage() {
        return endPage;
    }

    public Article setEndPage(int endPage) {
        this.endPage = endPage;
        return this;
    }

    public String getNameArticle() {
        return nameArticle;
    }

    public Article setNameArticle(String nameArticle) {
        this.nameArticle = nameArticle;
        return this;
    }

}
