package Structural.Facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Salad {

    List<String> ingredients = new ArrayList<String>();
    Scanner input = new Scanner(System.in);

    Salad() {

    }

    public void addIngredient(String name) {
        ingredients.add(name);
    }

    public void prepareSalad() {
        System.out.print("How many portions of salad? ");
        int number = input.nextInt();
        System.out.println("\n"+number+" portions are ready!");
    }

}
