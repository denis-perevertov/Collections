package Task3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";

        do {

            System.out.print("Vvedi nomer avto: ");
            input = scanner.next();
            if(input.equalsIgnoreCase("spisok")) System.out.println(set);
            else if (input.equalsIgnoreCase("stop")) break;

            set.add(input);

        } while(true);

    }


}
