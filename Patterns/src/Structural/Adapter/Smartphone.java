package Structural.Adapter;

import java.util.Scanner;

public class Smartphone implements Phone {

    public String name;
    public String model;

    Scanner input = new Scanner(System.in);

    @Override
    public void playMobileGames() {
        System.out.println("-- Playing 2048 -- ");
    }

    @Override
    public void call() {
        System.out.print("Input number to call: +38");
        String number = "+38"+input.nextLine();
        System.out.println("Calling "+number+"...");
        System.out.println("Call successful");
    }

    @Override
    public void listenToMusic() {
        System.out.println("-- Opening Spotify App --\nCHOOSE SONG");
        System.out.println("1. Thievery Corporation - Decollage\n2. Astral Projection - Rain\n3.Serj Tankian - No Tomorrow");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                System.out.println("♫ Playing Song #1 ♫");
                break;
            case 2:
                System.out.println("♫ Playing Song #2 ♫");
                break;
            case 3:
                System.out.println("♫ Playing Song #3 ♫");
                break;
            default:
                System.out.println("Song doesn't exist");
        }


    }

    @Override
    public void unlock() {
        System.out.println("FINGERPRINT UNLOCK");
    }
}
