package Behavioral.Visitor;

import java.awt.*;

public class Jeans implements Visitable {

    private double cost;
    private Color color;
    private String brandName;

    public Jeans(double cost) {
        this.cost = cost;
    }

    public Jeans(double cost, Color color, String brandName) {
        this.cost = cost;
        this.color = color;
        this.brandName = brandName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public double accept(Visitor v) {
        return v.calculateDiscount(this);
    }
}
