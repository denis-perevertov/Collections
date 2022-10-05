package Creational.Factory;

public class Tanker extends Ship{

    Tanker() {
        this.setLength(140.5);
        this.setMaxDraft(14.5);
        this.setMaxSpeed(15.0);
        this.setWidth(25.2);
        this.setName("LNG Tanker");
    }

    @Override
    public void processCargo() {

    }


}
