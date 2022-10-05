package Structural.Composite;

import java.awt.*;

public class CompositeDemo {

    public static void main(String[] args) {

        ShopItem bag1 = new ClothingBag(
                new T_Shirt(Color.BLACK, "XL"),
                new Jeans(Color.BLUE, "L"),
                new Jacket(Color.BLUE, "L")
        );

        System.out.println("Bag 1 cost is: ");
        System.out.println(bag1.calculateCost());

        ShopItem bag2 = new ClothingBag(
                new T_Shirt(Color.YELLOW, "M"),
                new T_Shirt(Color.ORANGE, "S"),
                new Shorts(Color.GRAY, "M")
        );

        System.out.println("Bag 2 cost is: ");
        System.out.println(bag2.calculateCost());

        ShopItem boots = new Boots(Color.BLACK, "L");

        ShopItem bigBag = new ClothingBag(bag1, bag2, boots);

        System.out.println("\nTotal cost is:");
        System.out.println(bigBag.calculateCost());


    }

}
