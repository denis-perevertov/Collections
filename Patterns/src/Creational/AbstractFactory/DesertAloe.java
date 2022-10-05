package Creational.AbstractFactory;

public class DesertAloe extends Flora {

    DesertAloe() {
        name = "Aloe";
        height = 0.50;
        width = 0.60;
    }

    public DesertAloe(double height, double width, String name) {
        super(height, width, name);
    }

    @Override
    public void multiply() {

    }

    @Override
    public String toString() {
        return "This is "+this.name+", height: "+this.height+", width: "+this.width;
    }

}
