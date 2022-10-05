package Creational.Factory;

public class BulkCarrier extends Ship{

    BulkCarrier() {
        this.setLength(190.5);
        this.setMaxDraft(13.5);
        this.setMaxSpeed(13.0);
        this.setWidth(30.2);
        this.setName("Bulk Carrier");
    }

    @Override
    public void processCargo() {

    }


}
