package Structural.Proxy;

import java.util.ArrayList;
import java.util.List;

public class ClubProxy implements ClubInterface {

    Club club;

    static List<Client> bannedClients = new ArrayList<>();
    static List<Client> listOfClients = new ClientBase().getListOfClients();

    ClubProxy() {
        club = new Club();
        bannedClients.add(new Client("Denis"));
        bannedClients.add(new Client("Igor"));
        bannedClients.add(new Client("Anton"));
    }

    public void enter (Client client) {
        if(!isBanned(client)) club.enter(client);
        else System.out.println("SORRY, "+client.name.toUpperCase()+" BUT YOU ARE BANNED");
    }

    public boolean isBanned (Client client) {
        for(int i = 0; i < bannedClients.size(); i++) {
            if(bannedClients.get(i).name.equalsIgnoreCase(client.name)) return true;
        }
        return false;
    }

}
