package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class ClothingBag implements ShopItem {

    List<ShopItem> itemList;
    public double cost;

    ClothingBag(ShopItem... items) {
        cost = 0.0;
        itemList = new ArrayList<>();
        for(ShopItem item : items) {
           itemList.add(item);
        }
    }

    @Override
    public double calculateCost() {

        cost = 0.0;
        for(ShopItem item : itemList) {
            cost += item.calculateCost();
        }
        return cost;

    }

    public void addItem (ShopItem item) {
        this.itemList.add(item);
    }

    public void removeItem (ShopItem item) {
        this.itemList.remove(item);
    }



}
