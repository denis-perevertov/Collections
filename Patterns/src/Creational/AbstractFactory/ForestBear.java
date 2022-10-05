package Creational.AbstractFactory;

import java.awt.*;

public class ForestBear extends Fauna {

    ForestBear() {
        name = "Bear";
        color = Color.gray;
        weight = 115;
        height = 2.00;
        limbsCount = 4;
    }

    public ForestBear(String name) {
        super(name);
    }

    public ForestBear(Color color, String name, double weight, double height) {
        super(color, name, weight, height);
    }

    @Override
    public void makeSound() {
        System.out.println("The Bear growls");
    }

    @Override
    public String toString() {
        return "This is a "+this.name+", color "+this.color+", weight: "+this.weight+", height: "+this.height;
    }
}
