package Structural.Flyweight;

import java.util.Random;

public class FlyweightDemo {

    static String[] colorList = {"green", "black", "blue", "red", "yellow", "cyan", "magenta", "brown", "white", "gray"};
    static String[] names = {"Ivan", "Anton", "Olena", "Anna", "Alex", "Yan", "Daniil", "Grisha", "Maria"};
    static int rowAmount = 1000;
    static int colAmount = 10000;

    public static void main(String[] args) {

        Random rand = new Random();

        TicketSeller seller = new TicketSeller();

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < rowAmount; i++) {
            for(int j = 0; j < colAmount; j++) {
                String personName = names[rand.nextInt(names.length)];
                int personAge = rand.nextInt(18,60);
                String colorName = colorList[rand.nextInt(colorList.length)];
                seller.sellTicket(i, j, personName, personAge, colorName);
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time to carry out operation: " + (endTime - startTime));

        System.out.println("Sold tickets to: "+ TicketSeller.people.size());

        System.out.println("Choosing random person");

        System.out.println(TicketSeller.people.get(rand.nextInt(TicketSeller.people.size())));
    }

}
