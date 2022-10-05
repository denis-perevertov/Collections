package Creational.AbstractFactory;

public class DesertSand extends Ground {

    DesertSand() {
        material = "Sand";
        density = 1.6;
    }

    @Override
    public void compress() {
        this.density *= 2;
    }

    @Override
    public String toString() {
        return "This is "+this.material+", density: "+this.density;
    }
}
