package Structural.Bridge;

public class BackGate implements Gate {

    public String name;

    BackGate(String name){
        this.name = name;
    }


    @Override
    public void open() {
        System.out.println("Opening the horizontal back gate");
        try{Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("...");
        try{Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("Zone "+this.name+" is open now");
        System.out.println("");
    }

    @Override
    public void close() {
        System.out.println("Closing the horizontal back gate");
        try{Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("...");
        try{Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("Zone "+this.name+" is closed now");
        System.out.println("");
    }

    @Override
    public void lightSwitch() {
        System.out.println("No lights to switch on here.");
        System.out.println("");
    }

    @Override
    public void setAlarm() {
        System.out.println("Setting alarm near the back gate");
        System.out.println("Alarm set in zone " + this.name);
        System.out.println("");
    }

    @Override
    public void removeAlarm() {
        System.out.println("Removing alarm near the back gate");
        System.out.println("Alarm removed in zone " + this.name);
        System.out.println("");
    }
}
