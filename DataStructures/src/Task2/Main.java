package Task2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int index = 0;

        do {

            System.out.print("Vvedi nomer avto: ");
            input = scanner.next();
            if(input.equalsIgnoreCase("spisok")) System.out.println(list);
            else if (input.equalsIgnoreCase("stop")) break;

            System.out.print("Vvedi index: ");
            index = scanner.nextInt();
            if(index > list.size()) list.add(input);
            else list.add(index, input);

        } while (true);
    }

}
