package Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {

    public String name;
    public int authorityLevel;
    public int rating;
    public List<News> newsFeed;
    public Mediator mediator;

    Component(String name, int authorityLevel, Mediator mediator) {
        this.name = name;
        this.authorityLevel = authorityLevel;
        this.mediator = mediator;
        rating = 1000;
        newsFeed = new ArrayList<>();
    }

    public void publish(News news) {
        mediator.factCheckAndPublish(this, news);
    }
    public void factCheckAndPublish(News news) {
    }

}
