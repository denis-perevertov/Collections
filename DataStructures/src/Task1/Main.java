package Task1;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";

        do {
            System.out.print("Vvedi nomer avto: ");
            input = scanner.nextLine();
            if(input.equalsIgnoreCase("spisok")) {
                System.out.println(stack);
            }
            else if(input.equalsIgnoreCase("stop")) break;
            else stack.push(input);
        } while (true);
    }

}
