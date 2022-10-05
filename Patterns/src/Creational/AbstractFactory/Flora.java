package Creational.AbstractFactory;

public abstract class Flora{

    public double height;
    public double width;
    public String name;

    Flora() {}

    public Flora(double height, double width, String name) {
        this.height = height;
        this.width = width;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void multiply();
}
