package Structural.Facade;

import java.util.ArrayList;
import java.util.List;

public class Beverage {

    public String name;
    public int volume;

    public void open() {
        System.out.println(this.name +" is opened.");
    }

    public void close() {
        System.out.println(this.name + "is closed.");
    }

    public void pour(int glass){
        int totalVolume = glass*200;
        if(totalVolume > this.volume) {
            System.out.println("Pouring into " + (this.volume/200) + "glasses");
        }
        else System.out.println("Pouring into " +glass + "glasses");
    }

}
