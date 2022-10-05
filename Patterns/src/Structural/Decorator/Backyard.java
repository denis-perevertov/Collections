package Structural.Decorator;

public class Backyard extends BuildingDecorator{

    Building building;

    Backyard(Building building) {
        this.building = building;
    }

    @Override
    public double calculateCost() {
        return building.calculateCost() + 2000;
    }

    @Override
    public String getName() {
        return building.getName() + " w/ Backyard";
    }

}
