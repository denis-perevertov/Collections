package Structural.Proxy;

public class Demo {

    public static void main(String[] args) {

        ClientBase base = new ClientBase();
        Client me = new Client("Denis");
        Client igor = new Client("Igor");
        Client anton = new Client("Anton");

        base.addClient(me, igor, anton);

        ClubInterface club = new Club();

        club.enter(me);
        club.enter(igor);
        club.enter(anton);

//        ClubInterface proxy = new ClubProxy();
//
//        proxy.enter(me);
//        proxy.enter(igor);
//        proxy.enter(anton);

    }
}
