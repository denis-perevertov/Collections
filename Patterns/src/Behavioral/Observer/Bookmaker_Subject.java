package Behavioral.Observer;

import java.util.ArrayList;

public class Bookmaker_Subject implements Subject {

    public static ArrayList<Observer> observerList;
    public double p1;
    public double p2;
    public double x;

    Bookmaker_Subject(){
        observerList = new ArrayList<>();
        p1 = 2.00;
        p2 = 2.00;
        x = 2.00;

    }

    @Override
    public void register(Observer o) {
        observerList.add(o);
        System.out.println("Added new observer");
    }

    @Override
    public void unregister(Observer o) {
        int obsIndex = observerList.indexOf(o);
        observerList.remove(obsIndex);
        System.out.println("Removed Observer "+obsIndex);

    }

    @Override
    public void notifyObservers() {

        for(Observer obs : observerList) {
            obs.update(p1,p2,x);
        }
    }

    public void setP1(double p1) {
        this.p1 = p1;
        notifyObservers();
    }

    public void setP2(double p2) {
        this.p2 = p2;
        notifyObservers();
    }

    public void setX(double x) {
        this.x = x;
        notifyObservers();
    }

    public void setCoef(double p1, double p2, double x) {
        this.p1 = p1;
        this.p2 = p2;
        this.x = x;
        notifyObservers();
    }
}
