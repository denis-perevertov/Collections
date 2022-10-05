package Structural.Bridge;

public class ParkingGate implements Gate {
    public String name;
    public int lightCount;

    ParkingGate(String name, int lightCount){
        this.name = name;
        this.lightCount = lightCount;
    }


    @Override
    public void open() {
        System.out.println("Opening the horizontal parking gate");
        try{Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("...");
        try{Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("Zone "+this.name+" is open now");
        System.out.println("");
    }

    @Override
    public void close() {
        System.out.println("Closing the horizontal parking gate");
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
        System.out.println("Setting alarm near the parking gate");
        System.out.println("Alarm set in zone " + this.name);
        System.out.println("");
    }

    @Override
    public void removeAlarm() {
        System.out.println("Removing alarm near the parking gate");
        System.out.println("Alarm removed in zone " + this.name);
        System.out.println("");
    }
}
