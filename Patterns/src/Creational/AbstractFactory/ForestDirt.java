package Creational.AbstractFactory;

public class ForestDirt extends Ground {

    public ForestDirt() {
        material = "Dirt";
        density = 5.51;
    }

    @Override
    public void compress() {
        this.density *= 1.5;
    }

    @Override
    public String toString() {
        return "This is "+this.material+", density: "+this.density;
    }
}
