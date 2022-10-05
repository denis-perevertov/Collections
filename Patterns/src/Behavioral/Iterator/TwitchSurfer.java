package Behavioral.Iterator;

import java.net.MalformedURLException;
import java.net.URL;

public class TwitchSurfer {

    public static void main(String[] args) throws MalformedURLException {

        TwitchChList channelList = new TwitchChList();

        setupChannels(channelList);

        Iterator twitchIterator = channelList.iterator("All");

        System.out.println("Showing all channels in the list");

        //Пролистать все каналы
        while(twitchIterator.hasNext()) {
            TwitchChannel ch = twitchIterator.nextChannel();
            System.out.println(ch.toString());
        }

        System.out.println("\nShowing channels only for Dota 2");

        twitchIterator = channelList.iterator("Dota 2");

        while(twitchIterator.hasNext()) {
            TwitchChannel ch = twitchIterator.nextChannel();
            if(ch != null) System.out.println(ch.toString());
        }

        System.out.println("\nShowing a random channel");

        twitchIterator = channelList.iterator("All");

        //Показать рандомный канал
        TwitchChannel ch = twitchIterator.chooseRandomChannel();
        System.out.println(ch.toString());

        // System.out.println(channelList.showNotAgeRestricted());

    }

    public static void setupChannels(TwitchChList chList) throws MalformedURLException {

        TwitchChannel ch1 = new TwitchChannel("JesusAVGN", new URL("https://www.twitch.tv/jesusavgn"), "Just Chatting", false);
        TwitchChannel ch2 = new TwitchChannel("Stray228", new URL("https://www.twitch.tv/stray228"), "Dota 2", false);
        TwitchChannel ch3 = new TwitchChannel("tiktoker55", new URL("https://www.twitch.tv/tiktoker55"), "Virtual Casino", true);
        TwitchChannel ch4 = new TwitchChannel("ybicanooobov", new URL("https://www.twitch.tv/ybicanooobov"), "Dota 2", false);
        TwitchChannel ch5 = new TwitchChannel("SilverName", new URL("https://www.twitch.tv/silvername"), "Heartstone", false);

        chList.addNewChannel(ch1);
        chList.addNewChannel(ch2);
        chList.addNewChannel(ch3);
        chList.addNewChannel(ch4);
        chList.addNewChannel(ch5);

    }

}
