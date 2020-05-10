package ua.asagayda.homework.task05.Inheritance.refactor;

public class Article extends Updated{
    int startPage;
    int endPage;
    String articleName;

    public Article(String author1, Boolean isUpdater, int year, int volume, int startPage, int endPage, String articleName) {
        super(author1, isUpdater, year, volume);
        this.startPage = startPage;
        this.endPage = endPage;
        this.articleName = articleName;
    }

    public Article(String author1, String author2, Boolean isUpdater, int year, int volume, int startPage, int endPage, String articleName) {
        super(author1, author2, isUpdater, year, volume);
        this.startPage = startPage;
        this.endPage = endPage;
        this.articleName = articleName;
    }

    public Article(String author1, String author2, String author3, Boolean isUpdater, int year, int volume, int startPage, int endPage, String articleName) {
        super(author1, author2, author3, isUpdater, year, volume);
        this.startPage = startPage;
        this.endPage = endPage;
        this.articleName = articleName;
    }

    public Article(String author1, String author2, String author3, String author4, Boolean isUpdater, int year, int volume, int startPage, int endPage, String articleName) {
        super(author1, author2, author3, author4, isUpdater, year, volume);
        this.startPage = startPage;
        this.endPage = endPage;
        this.articleName = articleName;
    }

    @Override
    public String toString() {
        return "Article{" +
                "startPage=" + startPage +
                ", endPage=" + endPage +
                ", articleName='" + articleName + '\'' +
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
