package Behavioral.Mediator;

public class News {

    public String name;
    public String topic;
    public String description;
    public boolean fakeNews;

    News(String name, String topic, String description, boolean fakeNews) {
        this.name = name;
        this.topic = topic;
        this.fakeNews = fakeNews;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
