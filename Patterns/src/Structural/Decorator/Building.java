package Structural.Decorator;

public abstract class Building {

    public String name = "Some unknown building";
    public abstract void plan();
    public abstract void build();
    public abstract void expand();
    public abstract void delete();
    public abstract double calculateCost();

    public String getName() {return this.name;};

}
