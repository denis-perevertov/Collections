package Structural.Facade;

import java.util.Scanner;

public class Fries {

    Scanner input = new Scanner(System.in);

    Fries() {

    }

    public void prepareFries() {
        System.out.print("How many portions of fries? ");
        int number = input.nextInt();
        System.out.println("\n"+number+" portions are ready!");
    }


}
