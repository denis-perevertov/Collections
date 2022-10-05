package Creational.AbstractFactory;

public class ForestBush extends Flora {

    ForestBush() {
        name = "Bush";
        height = 1.00;
        width = 1.00;
    }

    public ForestBush(double height, double width, String name) {
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
