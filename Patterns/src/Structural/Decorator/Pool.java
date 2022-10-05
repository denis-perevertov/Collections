package Structural.Decorator;

public class Pool extends BuildingDecorator{

    Building building;

    Pool(Building building) {
        this.building = building;
    }

    @Override
    public double calculateCost() {
        return building.calculateCost() + 2500;
    }

    @Override
    public String getName() {
        return building.getName() + ", w/ Pool";
    }
}
