package lessons.inheritance;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RefactorInheritance {

    public void processing(String author1, String author2,//Book
                           String author3, String author4,
                           int countOfpages, String nameBook,
                           Boolean isUpdated, int year, int volume ) {
//        do something with book
    }

    public void processing(String author1, String author2,//Article
                           String author3, String author4,
                           int startPage, int endPage,
                           String nameArticle,
                           Boolean isUpdated, int year, int volume ) {


//        do something with article

//        Заменить параметры на класс Reference, предложить рефакторинг
    }

}
