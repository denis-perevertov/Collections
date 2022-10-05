package Structural.Facade;

import java.util.Scanner;

public class PopcornMachine {

    Scanner input = new Scanner(System.in);

    public void preparePopcorn() {
        System.out.print("How many portions of popcorn? ");
        int number = input.nextInt();
        System.out.println("\n"+number+" portions are ready!");
    }

}
