package Creational.Builder;

import java.util.Scanner;

public class TankBuilderDemo {
    static String name;
    static Engine engine;
    static Barrel barrel;
    static Hull hull;
    static Tracks tracks;
    static Turret turret;

    public static void main(String[] args) {

        initializeTankParts();

        TankBuilder builder = new TankBuilder(name);

        Tank myTank = builder
                .setHull(hull)
                .setTracks(tracks)
                .setEngine(engine)
                .setBarrel(barrel)
                .setTurret(turret)
                .build();

        myTank.displayData();
    }

    //слишком массивный метод
    public static void initializeTankParts() {

        Scanner input = new Scanner(System.in);
        System.out.print("Input tank name: ");
        name = input.nextLine();
        System.out.println("Choose the type of hull\n 1 -- ABRAMS   2 -- T72   3 -- LEOPARD 2");
        switch(input.nextInt()){
            case 1:
                hull = new Hull("Abrams");
                break;
            case 2:
                hull = new Hull("T72");
                break;
            case 3:
                hull = new Hull("Leo2");
                break;
        }
        System.out.println("Choose the type of tracks\n 1 -- ABRAMS   2 -- T72   3 -- LEOPARD 2");
        switch(input.nextInt()){
            case 1:
                tracks = new Tracks("Abrams");
                break;
            case 2:
                tracks = new Tracks("T72");
                break;
            case 3:
                tracks = new Tracks("Leo2");
                break;
        }
        System.out.println("Choose the type of engine\n 1 -- ABRAMS   2 -- T72   3 -- LEOPARD 2");
        switch(input.nextInt()){
            case 1:
                engine = new Engine("Abrams");
                break;
            case 2:
                engine = new Engine("T72");
                break;
            case 3:
                engine = new Engine("Leo2");
                break;
        }
        System.out.println("Choose the type of barrel\n 1 -- ABRAMS   2 -- T72   3 -- LEOPARD 2");
        switch(input.nextInt()){
            case 1:
                barrel = new Barrel("Abrams");
                break;
            case 2:
                barrel = new Barrel("T72");
                break;
            case 3:
                barrel = new Barrel("Leo2");
                break;
        }
        System.out.println("Choose the type of turret\n 1 -- ABRAMS   2 -- T72   3 -- LEOPARD 2");
        switch(input.nextInt()){
            case 1:
                turret = new Turret("Abrams");
                break;
            case 2:
                turret = new Turret("T72");
                break;
            case 3:
                turret = new Turret("Leo2");
                break;
        }
    }

}
