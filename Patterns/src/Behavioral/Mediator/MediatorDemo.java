package Behavioral.Mediator;

import java.util.List;

public class MediatorDemo {

    public static void main(String[] args) {

        List<News> newsListForToday = new NewsProgramme(
                new News("General Staff report", "War in Ukraine", "Report for 26.09", false),
                new News("Pipeline sabotage", "Politics", "NS1-2 sabotaged", false),
                new News("5600$ stolen", "Criminal", "...", false),
                new News("Zimbabwe pronounced \"Best country to live in\"", "Sociology", "...", true),
                new News("Death of Joe Biden", "Politics", "...", true)
        ).getNewsList();

        NewsAgencyMediator newsAgencyMediator = new NewsAgencyMediator();

        populateMediator(newsAgencyMediator);

        System.out.println("\n PUBLISHING NEWS FOR TODAY \n");

        for(Component channel : newsAgencyMediator.getChannels()){
            for(News news : newsListForToday) {
                channel.publish(news);
            }
        };
    }

    static void populateMediator(NewsAgencyMediator mediator) {
       
        TelegramNewsChannel tg_ch1 = new TelegramNewsChannel("Truha", 0, mediator);
        TelegramNewsChannel tg_ch2 = new TelegramNewsChannel("UKR INFORM", 4, mediator);

        TVNewsChannel tv_ch1 = new TVNewsChannel("FREEDom", 5, mediator);
        TVNewsChannel tv_ch2 = new TVNewsChannel("Z1k", 2, mediator);

        InternetNewsWebsite int_site1 = new InternetNewsWebsite("Oryx", 10, mediator);
        InternetNewsWebsite int_site2 = new InternetNewsWebsite("Daily Kos", 7, mediator);
        InternetNewsWebsite int_site3 = new InternetNewsWebsite("RIA Novosti", -1, mediator);

        mediator.addChannel(tg_ch1);
        mediator.addChannel(tg_ch2);
        mediator.addChannel(tv_ch1);
        mediator.addChannel(tv_ch2);
        mediator.addChannel(int_site1);
        mediator.addChannel(int_site2);
        mediator.addChannel(int_site3);
    }
    
}
