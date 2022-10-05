package Structural.Adapter;

import java.util.Scanner;

public class Laptop implements Computer{

    public String name;
    public String model;

    Scanner input = new Scanner(System.in);

    @Override
    public void playGames() {
        System.out.println("-- Playing 2048 --");
    }

    @Override
    public void telegramCall() {
        System.out.println("-- Opening Telegram Application --");
        System.out.println("-- Calling your contact -- ");
        System.out.println("SUCCESSFUL");
        System.out.println("-- Turning camera on -- ");
        System.out.println("...");
        System.out.println("-- Ending call --");
    }

    @Override
    public void listenToMusic() {
        System.out.println("-- Opening AIMP --\nCHOOSE SONG");
        System.out.println("1. Thievery Corporation - Decollage\n2. Astral Projection - Rain\n3. Serj Tankian - No Tomorrow");
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
}
