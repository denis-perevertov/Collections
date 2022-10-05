package Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class NewsProgramme {

    static List<News> newsList = new ArrayList<>();

    NewsProgramme(News... news) {
        for(News newsArticle : news) {
            newsList.add(newsArticle);
        }
    }

    List<News> getNewsList() {
        return newsList;
    }

}
