package Behavioral.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TwitchChList implements TwitchChCollection {

    public List<TwitchChannel> chList;
    static final List<String> categories = Arrays.asList("All","Just Chatting", "CS:GO",
            "Dota 2", "Hot Tub", "GTA5", "Virtual Casino");

    TwitchChList() {
        chList = new ArrayList<>();
    }

    @Override
    public void addNewChannel(TwitchChannel ch) {
        chList.add(ch);
    }

    @Override
    public void removeChannel(TwitchChannel ch) {
        chList.remove(ch);
    }

    @Override
    public Iterator iterator(String category) {
        return new TwitchIterator(category, chList);
    }

    public List<TwitchChannel> showNotAgeRestricted () {
        List<TwitchChannel> newList = new ArrayList<>();
        int index = 0;
        for (TwitchChannel ch : chList) {
            if(!ch.ageRestricted) newList.add(index++, ch);
        }
        return newList;
    }

    private class TwitchIterator implements Iterator {

        private String category;
        private List<TwitchChannel> channelList;

        int pos;

        TwitchIterator(String category, List<TwitchChannel> channelList) {
            this.category = category;
            this.channelList = channelList;
            pos = 0;
        }

        public String getCategory() { return category; }
        public void setPos(int pos) { this.pos = pos; }

        @Override
        public boolean hasNext() {

            if(pos < channelList.size()) return true;
            else return false;
        }

        @Override
        public TwitchChannel nextChannel() {

            if(category.equals("All")) {
                if(this.hasNext()) return channelList.get(pos++);
                else {
                    pos = 0;
                    return channelList.get(pos);
                }
            }

            else {
                for(int i = 0; i < channelList.size(); i++) {
                    if(this.hasNext() && channelList.get(pos).category.equalsIgnoreCase(this.category)) return channelList.get(pos++);
                    else if(!this.hasNext()) break;
                    else pos++;
                }
            }

            return null;

        }

        @Override
        public TwitchChannel chooseRandomChannel() {

            pos = new Random().nextInt(0,channelList.size());
            if(channelList.get(pos) == null) pos = 0;

            return channelList.get(pos);
        }

    }
}
