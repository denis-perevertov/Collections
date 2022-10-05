package Behavioral.Template;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    static List<NavigationWatch> watch = new ArrayList<>();

    public static void main(String[] args) {

        NavigationWatch cadet = new Cadet();
        NavigationWatch officer = new WatchOfficer();
        NavigationWatch rating = new Rating();

        System.out.println("PROCESS OF THE WATCH FOR CADET");
        cadet.conductWatch();

        System.out.println("PROCESS OF THE WATCH FOR THE OFFICER");
        officer.conductWatch();

        System.out.println("PROCESS OF THE WATCH FOR THE RATING");
        rating.conductWatch();


    }

}
