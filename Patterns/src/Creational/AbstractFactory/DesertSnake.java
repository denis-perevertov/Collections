package Creational.AbstractFactory;

import java.awt.*;

public class DesertSnake extends Fauna {

    DesertSnake() {
        name = "snake";
        color = Color.green;
        weight = 10;
        height = 0.20;
        limbsCount = 0;
    }

    public DesertSnake(String name) {
        super(name);
    }

    public DesertSnake(Color color, String name, double weight, double height) {
        super(color, name, weight, height);
    }

    @Override
    public void makeSound() {
        System.out.println("sssssssssssssssssssss");
    }

    @Override
    public String toString() {
        return "This is a "+this.name+", color "+this.color+", weight: "+this.weight+", height: "+this.height;
    }
}
