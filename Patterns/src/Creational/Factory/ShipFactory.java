package Creational.Factory;

public abstract class ShipFactory {


    public void setUpInfrastructure() {

    }

    public void prepareInspection() {

    }

    public boolean checkInventory() {
        return false;
    }

    public abstract Ship createShip(String shipType);



}
