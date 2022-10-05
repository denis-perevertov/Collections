package Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class TicketSeller {

    public static List<SportsFan> people = new ArrayList<>();

    public void sellTicket(int row, int col, String name, int age, String color) {
        PersonType type = PersonFactory.getType(name, age, color);
        SportsFan person = new SportsFan(row, col, type);
        people.add(person);
    }

}
