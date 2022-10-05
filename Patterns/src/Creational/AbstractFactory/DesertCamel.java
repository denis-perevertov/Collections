package Creational.AbstractFactory;

import java.awt.*;

public class DesertCamel extends Fauna {

    DesertCamel() {
        name = "camel";
        color = Color.yellow;
        weight = 85;
        height = 1.50;
        limbsCount = 4;
    }

    public DesertCamel(String name) {
        super(name);
    }

    public DesertCamel(Color color, String name, double weight, double height) {
        super(color, name, weight, height);
    }

    @Override
    public void makeSound() {
        System.out.println("The camel screams");
    }

    @Override
    public String toString() {
        return "This is a "+this.name+", color "+this.color+", weight: "+this.weight+", height: "+this.height;
    }
    
}
