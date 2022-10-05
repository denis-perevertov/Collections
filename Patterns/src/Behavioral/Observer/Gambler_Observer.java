package Behavioral.Observer;

public class Gambler_Observer implements Observer {

    public double p1;
    public double p2;
    public double x;

    public static int observerIDTracker = 0;

    public int observerID;

    public Subject bookmaker;

    Gambler_Observer(Subject bookmaker) {
        this.bookmaker = bookmaker;
        this.observerID = ++observerIDTracker;
        bookmaker.register(this);
    }

    @Override
    public void update(double p1, double p2, double x) {
        this.p1 = p1;
        this.p2 = p2;
        this.x = x;

        showCoefficients();
    }

    public void showCoefficients() {
        System.out.println(
                "Coefficients for Observer "+observerID
                +"\nP1: "+p1
                +"\nP2: "+p2
                +"\nX: "+x);
    }
}
