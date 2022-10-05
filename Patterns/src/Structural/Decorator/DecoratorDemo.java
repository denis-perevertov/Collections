package Structural.Decorator;

public class DecoratorDemo {

    public static void main(String[] args) {

        Building myHouse = new House();

        System.out.println(myHouse.getName() + " - Cost: " + myHouse.calculateCost());

        Building myHouse2 = new House();
        myHouse2 = new Backyard(myHouse2);
        myHouse2 = new Pool(myHouse2);
        myHouse2 = new Parking(myHouse2);

        System.out.println(myHouse2.getName() + " - Cost: " + myHouse2.calculateCost());

        Building hospital = new Hospital();
        hospital = new Parking(hospital);

        System.out.println(hospital.getName() + " - Cost: " + hospital.calculateCost());

    }




}
