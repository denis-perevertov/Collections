package Creational.AbstractFactory;

public class ForestTree extends Flora {

    ForestTree() {
        name = "Tree";
        height = 5.00;
        width = 1.50;
    }

    public ForestTree(double height, double width, String name) {
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
