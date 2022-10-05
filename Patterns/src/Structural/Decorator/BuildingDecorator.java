package Structural.Decorator;

public abstract class BuildingDecorator extends Building {

    Building building;

    BuildingDecorator() {}

    BuildingDecorator(Building building) {
        this.building = building;
    }

    @Override
    public void plan() {

    }

    @Override
    public void build() {

    }

    @Override
    public void expand() {

    }

    @Override
    public void delete() {

    }

    @Override
    public double calculateCost() {
        return 0;
    }

    @Override
    public abstract String getName();
}
