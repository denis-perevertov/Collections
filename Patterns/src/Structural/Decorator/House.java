package Structural.Decorator;

public class House extends Building{


    House() {
        name = "House";
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
        return 10000;
    }
}
