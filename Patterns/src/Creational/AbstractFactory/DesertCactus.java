package Creational.AbstractFactory;

public class DesertCactus extends Flora {

    DesertCactus() {
        name = "Cactus";
        height = 0.80;
        width = 0.65;
    }

    public DesertCactus(double height, double width, String name) {
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
