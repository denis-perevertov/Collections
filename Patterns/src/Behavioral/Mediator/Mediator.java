package Behavioral.Mediator;

public interface Mediator {

    public void notify(Component sender, String event);
    public void addChannel(Component channel);
    public void publish(Component channel, News news);
    public void factCheckAndPublish(Component channel, News news);

}
