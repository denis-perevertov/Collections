package Task4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String inputNumber = "";
        String inputName = "";

        do {

            System.out.print("Vvedi nomer avto: ");
            inputNumber = scanner.next();
            if(inputNumber.equalsIgnoreCase("spisok")) {
                System.out.println(map);
                continue;
            }
            else if(inputNumber.equalsIgnoreCase("stop")) break;
            else if(inputNumber.equalsIgnoreCase("avtomobili"))  {
                System.out.println(map.keySet());
                continue;
            }
            else if(inputNumber.equalsIgnoreCase("vladelci")) {
                System.out.println(map.values());
                continue;
            }

            System.out.print("Vvedi imya vladel'ca: ");
            inputName = scanner.next();

            map.put(inputNumber, inputName);

        } while(true);


    }

}
