package Behavioral.Iterator;

public interface Iterator {

    public boolean hasNext();

    public TwitchChannel nextChannel();

    public TwitchChannel chooseRandomChannel();

//    public TwitchChannel nextChannelByType(String category);

}
