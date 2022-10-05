package Behavioral.Mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class NewsAgencyMediator implements Mediator {

    public List<Component> channelList;
    public HashMap<String, News> listOfPublishedNews = new HashMap<>();

    public NewsAgencyMediator() {
        channelList = new ArrayList<>();
    }

    @Override
    public void notify(Component sender, String event) {

        if(channelList.size() < 2) return;

        StringBuilder str = new StringBuilder("Given notification to channels ");

        for(Component channel : channelList) {
            if(channel != sender) {
                str.append(channel.name + ", ");
            }
        }
        str.deleteCharAt(str.length()-2);

        System.out.println(str.toString());
        System.out.println(event);
    }

    @Override
    public void addChannel(Component channel) {
        channelList.add(channel);
        notify(channel, "Notification: New channel added to the agency -- "+channel.name);
    }

    public List<Component> getChannels() {
        return channelList;
    }

    @Override
    public void publish(Component channel, News news) {
        if(listOfPublishedNews.size()==0) {
            System.out.println("-First news for today-");
            listOfPublishedNews.put(news.name, news);
        }
        else if(listOfPublishedNews.get(news.name) == null) listOfPublishedNews.put(news.name, news);
        else if(listOfPublishedNews.get(news.name).fakeNews) {
            if(channel.authorityLevel > 3) {
                System.out.println("Fake news published by another channel, won't publish");
                return;
            }
        }

        if(!news.fakeNews && channel.authorityLevel == -1) return;

        channel.newsFeed.add(news);
        this.listOfPublishedNews.putIfAbsent(news.name, news);

        System.out.println("News published on "+channel.name);
        System.out.println("-----------");
        System.out.println("Name: "+news.name);
        System.out.println("Topic: "+news.topic);
        System.out.println("Description: "+news.description);

        if(news.fakeNews) {
            System.out.println("Rating drops because of the fake news publish, rating -100");
            channel.rating -= 100;
        }
        else {
            System.out.println("Rating improves after true news publish, rating +10");
            channel.rating += 10;
        }

        System.out.println("------------\n");

        notify(channel, "Notification: Channel " +channel.name + " has published news "+news.name+"\n");
    }

    @Override
    public void factCheckAndPublish(Component channel, News news) {
        if(channel.authorityLevel < 3) {
            System.out.println("No fact check was conducted for channel " + channel.name);
            publish(channel, news);
            return;
        }
        else if(channel.authorityLevel < 6) {
            System.out.println("Minimal fact check was conducted for channel " + channel.name);
            if(news.fakeNews) {
                int chance = new Random().nextInt(0,100);
                if(chance%2==0) System.out.println("Fake news were found, no publish");
                else {
                    publish(channel, news);
                    return;
                }
            }
            else {
                publish(channel, news);
                return;
            }
        }
        else if(channel.authorityLevel < 0) {
            System.out.println("Deliberately fake news published by channel "+channel.name);
            publish(channel, news);
            return;
        }
        else System.out.println("Thorough fact check was carried out for channel " + channel.name);
        if(news.fakeNews) {
            int chance = new Random().nextInt(0,100);
            if(chance-10 >= 0) System.out.println("Fake news were found, no publish");
            else {
                publish(channel, news);
                return;
            }
        }
        else {
            publish(channel, news);
            return;
        }
    }
}
