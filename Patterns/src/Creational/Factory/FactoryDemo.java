package Creational.Factory;

public class FactoryDemo {

    public static void main(String[] args) {

        CargoShipFactory shipFactory = new CargoShipFactory();
        Ship ship1 = shipFactory.createShip("pcc");
        System.out.println("-----Ship 1 Info-----");
        System.out.println(ship1.toString());
        Ship ship2 = shipFactory.createShip("blk");
        System.out.println("-----Ship 2 Info-----");
        System.out.println(ship2.toString());
        Ship ship3 = shipFactory.createShip("lng");
        System.out.println("-----Ship 3 Info-----");
        System.out.println(ship3.toString());

        System.out.println("");
        ship3.moor();

        ship2.anchor();
    }


}
