package Behavioral.Iterator;

public interface TwitchChCollection {

    public void addNewChannel(TwitchChannel ch);

    public void removeChannel(TwitchChannel ch);

    public Iterator iterator(String category);

}
