package ua.asagayda.homework.task05.Inheritance.refactor2;

import java.util.Objects;

public class Article extends Author {
    int startPage;
    int endPage;
    String nameArticle;
    Boolean isUpdated;
    int year;
    int volume;

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

    public Boolean getUpdated() {
        return isUpdated;
    }

    public Article setUpdated(Boolean updated) {
        isUpdated = updated;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Article setYear(int year) {
        this.year = year;
        return this;
    }

    public int getVolume() {
        return volume;
    }

    public Article setVolume(int volume) {
        this.volume = volume;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article)) return false;
        Article article = (Article) o;
        return getStartPage() == article.getStartPage() &&
                getEndPage() == article.getEndPage() &&
                getYear() == article.getYear() &&
                getVolume() == article.getVolume() &&
                Objects.equals(getNameArticle(), article.getNameArticle()) &&
                Objects.equals(isUpdated, article.isUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStartPage(), getEndPage(), getNameArticle(), isUpdated, getYear(), getVolume());
    }
}
