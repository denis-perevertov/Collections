package Creational.Factory;

public class CargoShipFactory {

    public Ship createShip(String shipType) {
        switch(shipType.toLowerCase()){
            case("pcc"): return new CarCarrier();
            case("lng"): return new Tanker();
            case("blk"): return new BulkCarrier();
            default: return null;
        }
    }
}
