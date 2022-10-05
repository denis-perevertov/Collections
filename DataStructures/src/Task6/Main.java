package Task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<User> usersList = new ArrayList<>();

        usersList.add(new User(456, "Denis", "Perevertov", 22));
        usersList.add(new User(213, "Andrei", "Technik", 13));
        usersList.add(new User(325, "Olena", "Ivanova", 45));
        usersList.add(new User(11, "Anna", "Petrova", 67));
        usersList.add(new User(4, "Maria", "Sidorova", 11));
        usersList.add(new User(1452, "Artem", "Klukov", 16));
        usersList.add(new User(388, "Vasya", "Vetka", 24));
        usersList.add(new User(32, "Maks", "Soleniy", 31));
        usersList.add(new User(1874, "Nadim", "Moris", 16));
        usersList.add(new User(1, "Oleg", "Batya", 25));

        System.out.println("Before sort: ");
        for(User user: usersList) {
            System.out.println(user.toString());
        }

        Collections.sort(usersList);

        System.out.println("After sort: ");
        for(User user: usersList) {
            System.out.println(user.toString());
        }

        System.out.println("\nNow sorting with Comparator\n");

        Collections.shuffle(usersList);

        System.out.println("Before sort: ");
        for(User user: usersList) {
            System.out.println(user.toString());
        }

        usersList.sort((user1, user2) -> user1.number - user2.number);

        System.out.println("After sort: ");
        for(User user: usersList) {
            System.out.println(user.toString());
        }




    }


}
