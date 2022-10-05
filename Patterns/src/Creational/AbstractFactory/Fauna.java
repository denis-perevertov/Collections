package Creational.AbstractFactory;

import java.awt.*;

public abstract class Fauna{

    public Color color;
    public String name;
    public double weight;
    public double height;
    public int limbsCount;

    Fauna () {}

    public Fauna(String name) {
        this.name = name;
    }

    Fauna(Color color, String name, double weight, double height) {
        this.color = color;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getLimbsCount() {
        return limbsCount;
    }

    public abstract void makeSound();
}
