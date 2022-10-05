package Structural.Decorator;

public class Parking extends BuildingDecorator{

    Building building;

    Parking(Building building) {
        this.building = building;
    }

    @Override
    public double calculateCost() {
        return building.calculateCost() + 5000;
    }

    @Override
    public String getName() {
        return building.getName() + ", w/ Parking";
    }
}
