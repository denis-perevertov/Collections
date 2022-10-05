package Behavioral.Template;

import java.util.Objects;
import java.util.Scanner;

public abstract class NavigationWatch {

    public final void conductWatch() {


        System.out.println("\nStep 1: Briefing");
        receiveBriefing();
        System.out.println("\nStep 2: Check equipment");
        checkEquipment();
        System.out.println("\nStep 3: Get meteo data");
        getMeteoData();
        System.out.println("\nStep 4: Lookout");
        keepLookout();
        System.out.println("\nStep 5: Maneuver");
        maneuver();
        System.out.println("\nStep 6: Fill logs");
        fillLogs();
        System.out.println("\nStep 7: Watch transferred to the next officer");

    }

    public abstract void checkEquipment();
    public abstract void maneuver();
    public abstract void fillLogs();


    public void receiveBriefing() {
        System.out.println("Briefing on current nav.situation received");
    }

    public void getMeteoData() {
        System.out.println("-=- Checked psychrometer -=-");
        System.out.println("-=- Noted cloud coverage -=-");
        System.out.println("-=- Observed swell, wind waves ' speed & direction -=-");
        System.out.println("-=- Checked anemometer -=-");
        System.out.println("END: LOGGED THE OBSERVED DATA");
    }
    public void keepLookout() {
        Scanner input = new Scanner(System.in);
        System.out.println("Looking out... press q to stop");
        while(!Objects.equals(input.nextLine(), "q"))
            System.out.println("Looking out... press q to stop");
    }


}
