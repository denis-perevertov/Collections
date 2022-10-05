package Behavioral.Observer;

public class ObsDemo {

    public static void main(String[] args) {

        Bookmaker_Subject bookmaker = new Bookmaker_Subject();

        Observer gambler1 = new Gambler_Observer(bookmaker);
        Observer gambler2 = new Gambler_Observer(bookmaker);

        bookmaker.setCoef(3.70,2.70,1.80);



    }

}
