package Structural.Proxy;

public class Club implements ClubInterface {

    Client client;

    Club() {}
    public void enter(Client client) {
        System.out.println("Successfully entered");
        System.out.println("Welcome, " + client.name);
    }


}
