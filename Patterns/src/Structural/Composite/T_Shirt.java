package Structural.Composite;

import java.awt.*;

public class T_Shirt implements ShopItem {

    Color color;
    public String size;
    public double cost;

    //добавить описание

    T_Shirt(Color color, String size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public double calculateCost() {

        cost = 100.0;

        switch(size){
            case "L": cost += 10; break;
            case "XL": cost += 50; break;
        }
        return cost;

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
