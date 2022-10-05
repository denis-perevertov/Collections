package Behavioral.Template;

public class Rating extends NavigationWatch {

    @Override
    public void receiveBriefing() {
        System.out.println("========");
        System.out.println("-- Received briefing from previous rating --");
        System.out.println("END");
        System.out.println("========");
    }

    @Override
    public void checkEquipment() {
        System.out.println("========");
        System.out.println("-- Checked steering gear working condition --");
        System.out.println("-- Checked course meter --");
        System.out.println("END: ALL FOUND IN WORKING CONDITION");
        System.out.println("========");

    }

    @Override
    public void maneuver() {
        System.out.println("========");
        System.out.println("Carrying out officer's orders to change course");
        System.out.println("Turning...");
        try {Thread.sleep(3000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("END: MANEUVER SUCCESSFUL");
        System.out.println("========");
    }

    @Override
    public void fillLogs() {
        System.out.println("========");
        System.out.println("Filling out meteo data...");
        System.out.println("END: LOGS FILLED");
        System.out.println("========");
    }

}
