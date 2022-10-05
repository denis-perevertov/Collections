package Creational.Factory;

public class CarCarrier extends Ship {

    CarCarrier() {
        this.setLength(160.8);
        this.setMaxDraft(12.4);
        this.setMaxSpeed(14.0);
        this.setWidth(27.2);
        this.setName("Pure Car Carrier");
    }

    @Override
    public void processCargo() {

    }


}
