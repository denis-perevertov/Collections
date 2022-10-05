package Behavioral.Template;

public class Cadet extends NavigationWatch {

    @Override
    public void receiveBriefing() {
        System.out.println("========");
        System.out.println("-- Received plan for the watch from officer --");
        System.out.println("END");
        System.out.println("========");
    }

    @Override
    public void checkEquipment() {
        System.out.println("========");
        System.out.println("-- Checked ECDIS --");
        System.out.println("-- Checked VHF, MF/HF radios --");
        System.out.println("-- Checked AIS --");
        System.out.println("-- Checked X-Band/S-Band radars --");
        System.out.println("END: ALL FOUND IN WORKING CONDITION");
        System.out.println("========");

    }

    @Override
    public void maneuver() {
        System.out.println("========");
        System.out.println("Checking ARPA recommended course...");
        try {Thread.sleep(3000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("Taking the wheel to carry out officer's orders to change course");
        System.out.println("Turning...");
        try {Thread.sleep(3000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("END: MANEUVER SUCCESSFUL");
        System.out.println("========");
    }

    @Override
    public void fillLogs() {
        System.out.println("========");
        System.out.println("Filling out deck logbook");
        System.out.println("Filling out GMDSS radio log book");
        System.out.println("Filling out meteo data...");
        System.out.println("END: LOGS FILLED");
        System.out.println("========");
    }

}
