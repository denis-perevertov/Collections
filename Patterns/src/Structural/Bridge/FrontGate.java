package Structural.Bridge;

public class FrontGate implements Gate {

    public String name;
    public int lightCount;

    FrontGate(String name, int lightCount){
        this.name = name;
        this.lightCount = lightCount;
    }


    @Override
    public void open() {
        System.out.println("Opening the vertical front gate");
        try{Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("...");
        try{Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("Zone "+this.name+" is open now");
    }

    @Override
    public void close() {
        System.out.println("Closing the vertical front gate");
        try{Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("...");
        try{Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("Zone "+this.name+" is closed now");
        System.out.println("");
    }

    @Override
    public void lightSwitch() {
        System.out.println("Lights turned on in zone " + this.name + ": "+this.lightCount);
        System.out.println("");
    }

    @Override
    public void setAlarm() {
        System.out.println("Setting alarm near the front gate");
        System.out.println("Alarm set in zone " + this.name);
        System.out.println("");
    }

    @Override
    public void removeAlarm() {
        System.out.println("Removing alarm near the front gate");
        System.out.println("Alarm removed in zone " + this.name);
        System.out.println("");
    }
}
