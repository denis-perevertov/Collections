package Creational.AbstractFactory;

import java.awt.*;

public class ForestWolf extends Fauna {

    ForestWolf() {
        name = "Wolf";
        color = Color.BLACK;
        weight = 35;
        height = 1.00;
        limbsCount = 4;
    }

    public ForestWolf(String name) {
        super(name);
    }

    public ForestWolf(Color color, String name, double weight, double height) {
        super(color, name, weight, height);
    }

    @Override
    public void makeSound() {
        System.out.println("The wolf howls");
    }

    @Override
    public String toString() {
        return "This is a "+this.name+", color "+this.color+", weight: "+this.weight+", height: "+this.height;
    }
}
