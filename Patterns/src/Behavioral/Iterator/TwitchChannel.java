package Behavioral.Iterator;

import java.net.URL;

public class    TwitchChannel {

    public String name;
    public URL url;
    public String category;
    public boolean ageRestricted;

    public TwitchChannel(String name, URL url, String category, boolean ageRestricted) {
        this.name = name;
        this.url = url;
        this.category = category;
        this.ageRestricted = ageRestricted;
    }

    public String getName() {
        return name;
    }

    public URL getUrl() {
        return url;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "TwChannel -- "+ this.name + " -- URL: " + this.url + " -- Category: " + this.category;
    }
}
