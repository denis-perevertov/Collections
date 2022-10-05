package Creational.Factory;

public abstract class Ship {

    private double maxSpeed;
    private double length;
    private double width;
    private double maxDraft;
    private String name;

    public Ship() {
    }



    public Ship(double maxSpeed, double length, double width, double maxDraft, String name) {
        this.maxSpeed = maxSpeed;
        this.length = length;
        this.width = width;
        this.maxDraft = maxDraft;
        this.name = name;
    }

    public void moor() {
        System.out.println("Getting close to the berth...");
        System.out.println("Throwing first line");
        System.out.println("Pulling up to the berth");
        System.out.println("Throwing springs&breast lines");
        System.out.println("Tightening the lines");
        System.out.println("Securing the mooring station...");
        System.out.println("DONE");
    };
    public void anchor() {
        System.out.println("Reducing speed to 0...");
        System.out.println("Speed reduced, start lowering anchor...");
        System.out.println("Lowering...");
        System.out.println("Lowering...");
        System.out.println("Anchor hit the ground, stop lowering");
        System.out.println("Anchored successfully, securing the anchoring station...");
        System.out.println("DONE");
    };
    public abstract void processCargo();

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getMaxDraft() {
        return maxDraft;
    }

    public void setMaxDraft(double maxDraft) {
        this.maxDraft = maxDraft;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("Ship's length is: %,.2f \n" +
                "Ship's width is: %,.2f \n" +
                "Max speed is: %,.2f \n" +
                "Max draft is: %,.2f \n" +
                "Name: %s \n", this.getLength(), this.getWidth(), this.getMaxSpeed(), this.getMaxDraft(), this.getName());
    }
}
